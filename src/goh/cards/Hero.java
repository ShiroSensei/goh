package goh.cards;

import java.util.LinkedHashMap;

import goh.cards.heroes.Morgull;
import goh.cards.heroes.Saifen;
import goh.cards.heroes.Wamshir;

public abstract class Hero extends Concrete {

	// Attributes
	private Integer xp = 0;
	private static LinkedHashMap<Integer, String> heroesList = new LinkedHashMap<Integer, String>();

	// Getters & Setters
	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public static LinkedHashMap<Integer, String> getHeroesList() {
		return heroesList;
	}

	public static void setHeroesList(LinkedHashMap<Integer, String> heroesList) {
		Hero.heroesList = heroesList;
	}

	// Functions
	public static LinkedHashMap<Integer, String> listHeroes(LinkedHashMap<Integer, String> heroesList) {

		heroesList.put(1, " " + Morgull.class.getSimpleName());
		heroesList.put(2, " " + Wamshir.class.getSimpleName());
		heroesList.put(3, " " + Saifen.class.getSimpleName());

		setHeroesList(heroesList);

		return heroesList;
	}

	public void unlistHero(int index) {
		heroesList.remove(index);

	}

}
