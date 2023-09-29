package com.dojo.projects.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojo.projects.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
