package com.javacodegeeks.snippets.enterprise.hibernate;

import java.util.Date;

import com.javacodegeeks.snippets.enterprise.hibernate.model.Card;
import com.javacodegeeks.snippets.enterprise.hibernate.service.CardService;

public class App {

	public static void main(String[] args) {
		Date now = new Date();
		String name = "Vasya Pupkin";
		CardService cardService = new CardService();

		System.out.println("Просроченные книги:");
		for (Card card : cardService.findAll()) {
			if (card.getDate()!=null) {
				if (card.getDate().before(now)) {
					System.out.println(card.getBook().getTitle() + " Срок: " + card.getDate());
				}
			}
		}

		System.out.println("Просроченные книги клиента " + name + ":");
		for (Card card : cardService.findAll()) {
			if (card.getClient().getName().equals(name)) {
				if (card.getDate() != null) {
					if (card.getDate().before(now)) {
						System.out.println(card.getBook() + " Срок: " + card.getDate());
					}
				}
			}
		}
		System.exit(0);
	}
}
