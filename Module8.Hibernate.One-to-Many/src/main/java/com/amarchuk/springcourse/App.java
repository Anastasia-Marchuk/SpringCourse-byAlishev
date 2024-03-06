package com.amarchuk.springcourse;

import com.amarchuk.springcourse.module.Item;
import com.amarchuk.springcourse.module.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Person person=session.get(Person.class,2);
            System.out.println(person);


            Item newItem = new Item ("laptop apple", person);
            person.getItems().add(newItem);
            session.save(newItem);
//           -----------------------------------------------------------------------

            Person person2=new Person ("New Person", 33);
            Item newItem2 = new Item ("New Item 2", person2);
            person2.setItems(new ArrayList<Item>(Collections.singleton(newItem2)));
            session.save(person2);
            session.save(newItem2);

//            -----------------------------------------------------------------------

            List<Item> items=person2.getItems();
            for (Item item: items)
                session.remove(item);

            person.getItems().clear();

//            -----------------------------------Remove person with id 2--------------
//
//            Person personDelete=session.get(Person.class,2);
//            session.remove(personDelete);
//            ------------------------------------------------------------------------







            session.getTransaction().commit();


        } finally {
            sessionFactory.close();
        }
    }
}
