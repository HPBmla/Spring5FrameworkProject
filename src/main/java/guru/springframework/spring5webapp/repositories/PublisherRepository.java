package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
