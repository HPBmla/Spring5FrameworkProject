package guru.springframework.spring5webapp.model;

import javax.persistence.*;


import java.util.HashSet;
import java.util.Set;
@Entity
public class Author {

    private String firstName;
    private String lastName;
    @ManyToMany
    private Set<Book> books = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Author()
    {

    }

    public Author (String fName, String lName)
    {
        this.firstName=fName;
        this.lastName=lName;
    }

    public  Author(String fname,String lname, Set<Book> books)
    {
        this.firstName=fname;
        this.lastName=lname;
        this.books=books;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
