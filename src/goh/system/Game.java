package goh.system;

import java.util.ArrayList;
import java.util.List;

import goh.players.Player;
import goh.system.games.GameType;
import goh.system.gui.Board;
import goh.system.gui.Hand;

public class Game {

	Hand hand = new Hand();
	Board theBoard = new Board();
	String[][] board = theBoard.getTheBoard();

	List<Player> playersList = new ArrayList<Player>();

	public Game(GameType gameType) {
		switch (gameType) {
		case TEST:
			testGame();
		}
	}

	public void testGame() {
	

	}

}
