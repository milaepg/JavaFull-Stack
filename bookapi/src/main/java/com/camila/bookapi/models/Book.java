package com.camila.bookapi.models;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book{
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @NotBlank(message="Por favor llena este campo")
	    @Size(min = 5, max = 200, message="Por favor el titulo no debe ser menor a 5 caracteres")
	    private String title;
	    @NotBlank(message="Por favor llena este campo")
	    @Size(min = 5, max = 200, message="Por favor al descripcion no debe ser menor a 5 caracteres")
	    private String description;
	    @NotBlank(message="Por favor llena este campo")
	    @Size(min = 3, max = 40, message="Por favor al language no debe ser menor a 5 caracteres")
	    private String language;
	
	    @Min(100)
	    private Integer numberOfPages;
	    
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    public Book() {
	    }
	    
	    public Book(String title, String desc, String lang, int pages) {
	        this.title = title;
	        this.description = desc;
	        this.language = lang;
	        this.numberOfPages = pages;
	    }
	    
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public Integer getNumberOfPages() {
			return numberOfPages;
		}
		public void setNumberOfPages(Integer numberOfPages) {
			this.numberOfPages = numberOfPages;
		}
}
