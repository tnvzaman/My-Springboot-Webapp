package tnv.springframework.springwebapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import tnv.springframework.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
