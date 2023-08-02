package lk.ijse.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Book {

    @Id
    private int id;

    private String name;

    @ManyToMany
    private List<Author> authors;

    public Book() {}

    public Book(int id, String name, Author author, List<Author> authors) {
        this.id = id;
        this.name = name;
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthor() {
        return authors;
    }

    public void setAuthor(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                '}';
    }

}
