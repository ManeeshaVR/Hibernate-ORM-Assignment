package lk.ijse;

import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Madol Duwa");

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("Aba Yahaluvo");

        Book book3 = new Book();
        book3.setId(3);
        book3.setName("Hath Pana");

//        //Create Database & Insert Values
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(book1);
//        session.persist(book2);
//        session.persist(book3);
//        transaction.commit();
//        session.close();

//        //Update Values
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(book1);
//        session.merge(book2);
//        session.merge(book3);
//        transaction.commit();
//        session.close();

//        //Delete Values
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        session.delete(book1);
//        session.delete(book2);
//        session.delete(book3);
//        transaction.commit();
//        session.close();

//        //Search Values
//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        Book book4 = session.get(Book.class,1);
//        System.out.println(book4);
//        transaction.commit();
//        session.close();

    }
}
