package com.javatpoint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatpoint.model.Books;
@Repository
public interface BooksRepository extends CrudRepository<Books,Integer>{
 
}
