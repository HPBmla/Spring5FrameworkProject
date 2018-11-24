package guru.springframework.spring5webapp.model;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Book {
    private String title;
    private String isbn;
    private String publisher;
    @ManyToMany
    private Set<Author> authors = new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    public Book()
    {

    }
    public Book(String title, String isbn, String pub, Set<Author> authors)
    {
      this.title=title;
      this.isbn=isbn;
      this.publisher=pub;
      this.authors=authors;
    }

    public Book(String title, String isbn, String pub)
    {
        this.title=title;
        this.isbn=isbn;
        this.publisher=pub;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }



}
