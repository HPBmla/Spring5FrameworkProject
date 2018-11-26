package guru.springframework.spring5webapp.model;

import javax.persistence.*;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
public class Author {

    private String firstName;
    private String lastName;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                ", id=" + id +
                '}';
    }
}
