package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository)
    {
        this.authorRepository=authorRepository;
        this.bookRepository=bookRepository;
        this.publisherRepository=publisherRepository;
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author erric = new Author("erric","Evan");
        Publisher publisher = new Publisher();
        publisher.setName("Madhavee");
        publisherRepository.save(publisher);
        Book book1 = new Book("Domain Driven Design","1234",publisher);
        erric.getBooks().add(book1);
        book1.getAuthors().add(erric);

        authorRepository.save(erric);
        bookRepository.save(book1);

        Author rod = new Author("rod","Bimla");
        Book book2 = new Book("J2EE Design","3214",publisher);
        erric.getBooks().add(book2);
        book1.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(book2);
    }
}
