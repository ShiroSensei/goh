package goh.system.gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class Board extends JFrame {

	// Attributes
	private String[][] board = new String[5][5];

	// Getters & Setters
	public String[][] getTheBoard() {
		return board;
	}

	public void setTheBoard(String[][] board) {
		this.board = board;
	}

	// Constructors
	public Board() {
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Plateau");
		this.setSize(300, 300);


		String title[] = { "Lieu", "H�ros" };
		board[0][0] = "Maison de l'ennemi";
		board[1][0] = "Ville";
		board[2][0] = "For�t";
		board[3][0] = "Ville";
		board[4][0] = "Ta maison";
		JTable jBoard = new JTable(getTheBoard(), title);
		this.getContentPane().add(new JScrollPane(jBoard));
		
		this.setVisible(true);
	}
	
	// Functions
	
	// Une fonction qui r�cup�re l'emplacement des cartes

}
