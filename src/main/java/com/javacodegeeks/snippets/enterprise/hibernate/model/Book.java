package com.javacodegeeks.snippets.enterprise.hibernate.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name= "author")
	String author;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "book_id")
	private Set<Card> cards;

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	public Book() {
	}

	public Book(Integer id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book: " + this.id + ", " + this.title + ", " + this.author;
	}
	
}