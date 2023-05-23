package com.camila.bookapi.respositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.camila.bookapi.models.Book;

@Repository

public interface BookRepo extends CrudRepository<Book, Long>{
	
	List<Book> findAll();
	List<Book> findByDescriptionContaining(String search);
	Long countByTitleContaining(String search);
	Long deleteByTitleStartingWith(String search);
	



}