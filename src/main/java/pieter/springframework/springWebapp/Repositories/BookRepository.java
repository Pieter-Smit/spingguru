package pieter.springframework.springWebapp.Repositories;

import org.springframework.data.repository.CrudRepository;

import pieter.springframework.springWebapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
