package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> books1 = new ArrayList<>();
        List<Book> books2 = new ArrayList<>();
        List<Book> books3 = new ArrayList<>();

        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Kumarathunga Munidasa");

        Author author2 = new Author();
        author2.setId(2);
        author2.setName("T.B. Ilangarathna");

        Author author3 = new Author();
        author3.setId(3);
        author3.setName("Martin Wikramasingha");

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("Madol Duwa");
        book1.setAuthor(author3);

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("Aba Yahaluvo");
        book2.setAuthor(author2);

        Book book3 = new Book();
        book3.setId(3);
        book3.setName("Hath Pana");
        book3.setAuthor(author1);

        Book book4 = new Book();
        book4.setId(4);
        book4.setName("Gam Peraliya");
        book4.setAuthor(author3);

        Book book5 = new Book();
        book5.setId(5);
        book5.setName("Heen Saraya");
        book5.setAuthor(author1);

        Book book6 = new Book();
        book6.setId(6);
        book6.setName("Magul Kama");
        book6.setAuthor(author1);

        books1.add(book3);
        books1.add(book5);
        books1.add(book6);

        books2.add(book2);

        books3.add(book1);
        books3.add(book4);

        author1.setBooks(books1);
        author2.setBooks(books2);
        author3.setBooks(books3);


        //Create Database & Insert Values
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(book1);
        session.persist(book2);
        session.persist(book3);
        session.persist(book4);
        session.persist(book5);
        session.persist(book6);
        session.persist(author1);
        session.persist(author2);
        session.persist(author3);
        transaction.commit();
        session.close();
    }
}
