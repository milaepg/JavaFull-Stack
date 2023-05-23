package com.camila.bookapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.camila.bookapi.models.Book;
import com.camila.bookapi.servicies.BookServ;

import jakarta.validation.Valid;

@Controller
public class BookController {
	
	@Autowired
	private BookServ bookserv;

	@GetMapping("/")
	public String raiz() {
		return "redirect:/books";
	}
	@GetMapping("/books")
	public String index(Model viewModel) {
		viewModel.addAtribute("libros", bookserv.allBooks());
		return "index.jsp";
	}
	
	@GetMapping("/books/new")
	public String nuevoLibro(@ModelAttribute("book") Book book) {
		return "nuevo.jsp";
	}
	@PostMapping("/books/new")
	public String crearLibro(@Valid @ModelAttribute("book") Book book, BindingResult resultado) {
		if (resultado.hasErrors()) {
			return "nuevo.jsp";
		} else {

			bookserv.createBook(book);
			return "redirect:/books";

		}
	}
	@GetMapping("/books/{bookId}")
	public String mostrarLibro(Model viewModel, @PathVariable("bookId") Long bookId) {
		viewModel.addAttribute("libro", bookserv.findBook(bookId));
		return "mostrar.jsp";
	}
	@GetMapping("/books/edit/{bookId}")
	public String formualrioEdicion(@ModelAttribute("libro") Book libro, 
			@PathVariable("bookId") Long bookId,
			Model viewModel) {
		Book unlibro = bookserv.findBook(bookId);
		viewModel.addAttribute("unlibro", unlibro);
		return "editar.jsp";
	}
	@PutMapping("/books/edit/{bookId}")
	public String editarLibro(@ModelAttribute("libro") Book libro, 
			@PathVariable("bookId") Long bookId, Model viewModel,
			BindingResult resultado) {
		if (resultado.hasErrors()) {
			return "editar.jsp";
		} else {
			bookserv.updateBook(libro);
			return "redirect:/books";

		}
		
	}
	@GetMapping("/books/delete/{bookId}")
	public String eliminarLibro(@PathVariable("bookId") Long bookId) {
		bookserv.deleteBook(bookId);
		return "redirect:/books";
	}


}
