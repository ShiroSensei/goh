package goh.tests;

import goh.cards.Hero;
import goh.players.Player;
import goh.system.Game;
import goh.system.games.GameType;
import goh.system.gui.Board;

public class Test {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		Game testGame = new Game(GameType.TEST);
		
		Player p1 = new Player();
		Player p2 = new Player();
		Board theBoard = new Board();
		String[][] board = theBoard.getTheBoard();
		
		System.out.println("Bienvenue étranger. Choisis ton héros !!");
		System.out.println(Hero.listHeroes(Hero.getHeroesList()));
		p1.pickHero(p1);
	
		board[4][1] = (p1.getPlayerHeroName() + " (DMG:" + p1.getPlayerHero().getDmg().toString() + " | HP:" + p1.getPlayerHero().getHp().toString() + ")");
		theBoard.repaint();
	
		System.out.println("Tu as choisi : " + p1.getPlayerHeroName());
		System.out.println("HP = " + p1.getPlayerHero().getHp());
		System.out.println("Héros de l'adversaire ?");
		System.out.println(Hero.getHeroesList());

		p2.pickHero(p2);
		board[0][1] = (p2.getPlayerHeroName() + " (DMG:" + p2.getPlayerHero().getDmg().toString() + " | HP:" + p2.getPlayerHero().getHp().toString() + ")");
		theBoard.repaint();
		
		System.out.println("L'adversaire est : " + p2.getPlayerHeroName());
		System.out.println("HP = " + p2.getPlayerHero().getHp());
		
p1.getPlayerHero().attacks(p2.getPlayerHero());

	}

}