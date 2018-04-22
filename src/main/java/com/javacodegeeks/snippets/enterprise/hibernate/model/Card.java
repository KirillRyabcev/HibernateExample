package com.javacodegeeks.snippets.enterprise.hibernate.model;

/**
 * Created by Acer on 19.04.2018.
 */
import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Card {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client_id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "book_id", nullable = false)
    private Book book_id;

    @Column(name= "date")
    private Date date;

    public Card() {
    }

    public Card(Integer id, Client client_id, Book book_id, Date date) {
        this.id = id;
        this.client_id = client_id;
        this.book_id = book_id;
        this.date = date;
    }

    public Card(Integer id, Client client_id, Book book_id) {
        this.id = id;
        this.client_id = client_id;
        this.book_id = book_id;
    }

    public Book getBook() {
        return book_id;
    }

    public void setBook(Book book_id) {
        this.book_id = book_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client_id;
    }

    public void setClient(Client client_id) {
        this.client_id = client_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", client_id=" + client_id +
                ", book=" + book_id +
                ", date=" + date +
                '}';
    }
}