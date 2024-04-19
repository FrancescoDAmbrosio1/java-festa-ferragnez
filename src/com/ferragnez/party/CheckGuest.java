package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	creo ed inizializzo array
		String [] guests = {"dua lipa", "paris hilton", "manuel agnelli", "j-ax", 
				"francesco totti", "ilary blasi", "vebe vio", "luis", "pardis zarei",
				"martina maccherone", "rachel zeilic"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome per sapere se puoi entrare al party:");
		String name = scan.nextLine();
		// indifferentemente dall'input dell'utente trasformo il nome in minuscolo
		String nameLowerCase = name.toLowerCase();
		for (int i = 0; i < guests.length; i++) {
			if(guests[i].equals(nameLowerCase)) {
				System.out.println("----- Puoi entrare alla festa -----");
				break;
			} else if (i == guests.length-1) {
				System.out.println("----- NON puoi entrare alla festa!!!! -----");
			}
		}
	}

}
