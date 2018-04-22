package com.javacodegeeks.snippets.enterprise.hibernate.model;

/**
 * Created by Acer on 19.04.2018.
 */
import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Client {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name= "age")
    private Integer age;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client_id")
    private Set<Card> cards;

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    public Client() {
    }

    public Client(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
