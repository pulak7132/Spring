package com.pulak.springweb.repositories;

import com.pulak.springweb.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
