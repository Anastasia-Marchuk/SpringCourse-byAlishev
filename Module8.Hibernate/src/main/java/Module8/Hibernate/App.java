package Module8.Hibernate;


import Module8.Hibernate.module.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
       Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

       SessionFactory sessionFactory = configuration.buildSessionFactory();
       Session session = sessionFactory.getCurrentSession();

       try {
           session.beginTransaction();


           Person person1 = new Person("Person1",30);
           Person person2 = new Person("Person2",40);
           Person person3 = new Person("Person3",50);


           session.save(person1);
           session.save(person2);
           session.save(person3);

           Person personresult = session.get(Person.class, 1);
           System.out.println("New Person: "+personresult.getName());
           System.out.println(personresult.getAge());

           personresult.setName("Stacy");
           personresult.setAge(30);
           System.out.println("Updated person with new name and age: "+personresult.getName() + ", "+personresult.getAge());


           System.out.println("All people with age>30: ");
           List<Person> people =session.createQuery("FROM Person WHERE age>30").getResultList();
           for (Person p:people)
               System.out.println(p);


           System.out.println("Update people with age<30: ");
           session.createQuery("UPDATE Person set name='TESTNAME < 30' WHERE age<30").executeUpdate();
           List<Person> people2 =session.createQuery("FROM Person WHERE age<30").getResultList();
           for (Person p:people2)
               System.out.println(p);






         session.getTransaction().commit();

           System.out.println("ID= "+personresult.getId());

       } finally {
         sessionFactory.close();
       }
    }
}
