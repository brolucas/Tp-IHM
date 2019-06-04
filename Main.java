import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Point; 
public class Main {



public static void main(String[] args){
	
	// TODO initialiser JFrame
	
	JFrame Fen = new JFrame();
	Fen.setLayout(new BorderLayout());
	
	// TODO exit on close 
	
	Fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// TODO parametrer Fen
	
	Fen.setExtendedState(JFrame.MAXIMIZED_BOTH);
	
	// TODO initialiser JPan
	
	JPanel Pandessin = new JPanel();
	
	// TODO Ajouter Pandessin
	
	Fen.add(Pandessin, BorderLayout.CENTER);
	
	// TODO Panneau Nord
	Color[] Couleur ={Color.black, Color.red, Color.green, Color.pink, Color.yellow};
	JPanel PanN =  new JPanel();
	PanN.setLayout(new FlowLayout());
	JLabel couleur = new JLabel();
	PanN.add(couleur);
	JComboBox ChoixCouleur = new JComboBox(Couleur);
	PanN.add(ChoixCouleur);
	ChoixCouleur.setSelectedIndex(0);
	Fen.add(PanN, BorderLayout.NORTH);
	
	// TODO afficher JFrame
	Fen.setVisible(true);
	
	
}

}

