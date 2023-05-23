package com.camila.bookapi.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.bookapi.models.Book;
import com.camila.bookapi.respositories.BookRepo;

@Service
public class BookServ {


		@Autowired
		private BookRepo bookrepo;

		
		public List<Book> allBooks() {
			return bookrepo.findAll();
		}

		public Book createBook(Book b) {
			return bookrepo.save(b);
		}


		public Book findBook(Long id) {
			Optional<Book> optionalBook = bookrepo.findById(id);
			if (optionalBook.isPresent()) {
				return optionalBook.get();
			} else {
				return null;
			}
		}


		public Book updateBook(Long id, String title, String desc, String lang, int pages) {
			Optional<Book> optionalBook = bookrepo.findById(id);
			if (optionalBook.isPresent()) {
				Book bookToUpdate = optionalBook.get();
				bookToUpdate.setTitle(title);
				bookToUpdate.setDescription(desc);
				bookToUpdate.setLanguage(lang);
				bookToUpdate.setNumberOfPages(pages);
				bookrepo.save(bookToUpdate);
				return bookToUpdate;
			} else {
				return null;
			}
		}


		public Book updateBook(Long id, String title, String desc, String lang) {
			Book optionalBook = bookrepo.findById(id).orElse(null);
			if (optionalBook != null) {
				optionalBook.setTitle(title);
				optionalBook.setDescription(desc);
				optionalBook.setLanguage(lang);

				bookrepo.save(optionalBook);
				return optionalBook;
			} else {
				return optionalBook;
			}
		}
		
		public Book updateBook(Book book) {
			Book actualizarLibro = findBook(book.getId());
			actualizarLibro.setTitle(book.getTitle());
			actualizarLibro.setLanguage(book.getLanguage());
			actualizarLibro.setDescription(book.getDescription());
			actualizarLibro.setNumberOfPages(book.getNumberOfPages());
			bookrepo.save(actualizarLibro);

			return actualizarLibro;
		
		}
		
		public void deleteBook(Long id) {
			bookrepo.deleteById(id);
		}

}
