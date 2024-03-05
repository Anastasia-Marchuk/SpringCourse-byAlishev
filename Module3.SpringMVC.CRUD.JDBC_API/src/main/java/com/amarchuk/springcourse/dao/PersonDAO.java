package com.amarchuk.springcourse.dao;

import com.amarchuk.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;

    private static final String URL = "jdbc:postgresql://localhost:5432/first_db";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "130352";

    private static Connection connection;

    static{
        try {
            Class.forName("org.postgresql.Driver");
        }catch (ClassNotFoundException e){
             e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Person> index() {

        List<Person> people = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            String SQL = "SELECT * FROM person";
            ResultSet resultSet = statement.executeQuery(SQL);

            while(resultSet.next()) {
                Person person = new Person();

                person.setId(resultSet.getInt("id"));
                person.setName(resultSet.getString("name"));
                person.setEmail(resultSet.getString("email"));
                person.setAge(resultSet.getInt("age"));

                people.add(person);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return people;
    }

    public Person show(int id) throws SQLException {

        Person person=null;

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM person WHERE id=?");
        preparedStatement.setInt(1,id);

        ResultSet resultSet=preparedStatement.executeQuery();

        resultSet.next();

        person.setId(resultSet.getInt("id"));
        person.setName(resultSet.getString("name"));
        person.setEmail(resultSet.getString("email"));
        person.setAge(resultSet.getInt("age"));

        return person;
    }

    public void save(Person person){

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO person VALUES(1,?,?,?)");

            preparedStatement.setString(1,person.getName());
            preparedStatement.setInt(2,person.getAge());
            preparedStatement.setString(3,person.getEmail());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void update(int id, Person updatedPerson) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE person SET name=?, age=?, email=?, WHERE id=?");

        preparedStatement.setString(1,updatedPerson.getName());
        preparedStatement.setInt(2,updatedPerson.getAge());
        preparedStatement.setString(3,updatedPerson.getEmail());
        preparedStatement.setInt(4,id);

        preparedStatement.executeUpdate();
    }

    public void delete(int id) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM person WHERE id=?");

        preparedStatement.setInt(1,id);

        preparedStatement.executeUpdate();
    }

}

