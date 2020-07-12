package com.pulak.springweb.repositories;

import com.pulak.springweb.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Long> {
}
