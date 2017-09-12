package pieter.springframework.springWebapp.Repositories;

import org.springframework.data.repository.CrudRepository;

import pieter.springframework.springWebapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
