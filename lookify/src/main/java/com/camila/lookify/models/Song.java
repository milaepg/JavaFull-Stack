package com.camila.lookify.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="songs")
public class Song {
	//Attributes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Size(min = 5, max = 30)
		private String title;
		
		@Size(min = 5, max = 30)
		private String artist;
		
		private Integer rating;
		
		@Column(updatable=false)
		private Date createdAt;
		private Date updatedAt;
		
		@PrePersist
		protected void onCreate() {
			this.createdAt = new Date();
		}
		@PreUpdate
		protected void onUpdate() {
			this.updatedAt = new Date();
		}
		
		//Construtors
		public Song() {
		}
		
		public Song(Long id, String title, String artist, Integer rating) {
			this.id = id;
			this.title = title;
			this.artist = artist;
			this.rating = rating;
		}
		
		//Getters
		public Long getId() {
			return id;
		}
		public String getTitle() {
			return title;
		}
		public String getArtist() {
			return artist;
		}
		public Integer getRating() {
			return rating;
		}
		public Date getCreatedAt() {
			return createdAt;
		}
		public Date getUpdatedAt() {
			return updatedAt;
		}
		
		//Setters
		public void setId(Long id) {
			this.id = id;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public void setRating(Integer rating) {
			this.rating = rating;
		}
		public void setCreatedAt(Date createdAt) {
			this.createdAt = createdAt;
		}
		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}	
}
