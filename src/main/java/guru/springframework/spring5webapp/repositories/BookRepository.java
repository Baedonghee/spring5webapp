package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by donghee on 2021/03/17
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
