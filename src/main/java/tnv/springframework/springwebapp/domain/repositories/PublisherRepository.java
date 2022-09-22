package tnv.springframework.springwebapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import tnv.springframework.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
