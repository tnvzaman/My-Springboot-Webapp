package tnv.springframework.springwebapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import tnv.springframework.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
