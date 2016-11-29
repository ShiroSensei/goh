package goh.players;

import java.util.Scanner;

import goh.cards.Hero;
import goh.cards.heroes.Morgull;
import goh.cards.heroes.Saifen;
import goh.cards.heroes.Wamshir;
//import goh.system.gui.Hand;

public class Player {

	// Attributes
	private Hero playerHero;
	//private Hand playerHand;

	// Getters & Setters
	public Hero getPlayerHero() {
		return playerHero;
	}

	public void setPlayerHero(Hero playerHero) {
		this.playerHero = playerHero;

	}

	public String getPlayerHeroName() {
		return getPlayerHero().getCardName();
	}

//	public Hand getPlayerHand() {
//		return playerHand;
//	}

//	public void setPlayerHand(Hand playerHand) {
//		this.playerHand = playerHand;
//	}

	// Functions
	public void pickHero(Player player) {
		
		boolean inputOk = true;
		
		do {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int choice = 0;

			if (inputOk == false) {
				System.out.println("Saisie incorrecte");
			}
			System.out.println("Choisis un héros");
			inputOk = true;

			if (sc.hasNextInt()) {
				choice = sc.nextInt();

				if (choice >= 1 && choice <= 3) {
	
					switch (choice) {
					case 1:
						if (Hero.getHeroesList().containsKey(1)) {
						Hero morgull = new Morgull(); 
						player.setPlayerHero(morgull);
						morgull.unlistHero(1);
						} else {
							System.out.println("Héros déjà pris...");
							player.pickHero(player);
							
							continue;
							
						}
						break;

					case 2:
						if (Hero.getHeroesList().containsKey(2)) {
						Hero wamshir = new Wamshir();
						player.setPlayerHero(wamshir);
						wamshir.unlistHero(2);
						} else {
							System.out.println("Héros déjà pris...");
							player.pickHero(player);
						}
						break;
						
					case 3:
						if(Hero.getHeroesList().containsKey(3)) {
						Hero saifen = new Saifen();
						player.setPlayerHero(saifen);
						saifen.unlistHero(3);
						} else {
							System.out.println("Héros déjà pris...");
							player.pickHero(player);
						}
						break;

					default:
						System.out.println("Pas compris");
						inputOk = false;

					}
				} else {
					inputOk = false;
				}
			} else {
				inputOk = false;
			}
			sc.nextLine();
	
		} while (inputOk == false);
		
	}

}
