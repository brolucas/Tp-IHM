import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Point; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Main extends JFrame {

private JButton Couleur;

public JButton Creationboutoncouleur(String nom){
JButton  Couleur = new JButton(nom);
return Couleur ;



}

public void actionPerformed(ActionEvent e){
	
	Object source = e.getSource() ;
	if (source == Couleur) {
	Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);
	}

}





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
	JPanel PanN =  new JPanel();
	//coucou = new JButton("Choix Couleur de fond");
	//Ecoute blis = new Ecoute();
	Couleur=Creationboutoncouleur("Couleur");
	Couleur.addActionListener(this);
	PanN.add(Couleur);
	JLabel Couleurf = new JLabel("Couleur de fond de la figure");
	Color[] CouleurF ={Color.black, Color.red, Color.green, Color.pink, Color.yellow}; // TODO JComboBox Couleur de fond
	//PanN.add(couleur);
	
	PanN.setLayout(new FlowLayout());
	JLabel couleur = new JLabel();
	PanN.add(couleur);
	JComboBox ChoixCouleur = new JComboBox(CouleurF);
	PanN.add(ChoixCouleur);
	ChoixCouleur.setSelectedIndex(0);
	JLabel Forme = new JLabel("Forme de la Figure");
	PanN.add(Forme);
	String[] Fig = {"rectangle","Triangle","Cercle","Ellipse"}; // TODO JComboBox Forme
	JComboBox Figure = new JComboBox(Fig);
	PanN.add(Figure);
	Fen.add(PanN, BorderLayout.NORTH);
	JLabel CouleurC = new JLabel("Couleur de contour");	//TODO JComboBox couleur de contour 
	PanN.add(CouleurC);
	JComboBox CouleurCo = new JComboBox(CouleurF);
	PanN.add(CouleurCo);
	//TODO Rajouter JButton
	JButton bd = new JButton("Dessiner");
	PanN.add(bd);
	JButton bs = new JButton("Supprimer");
	PanN.add(bs);
	
	
	// TODO afficher JFrame
	Fen.setVisible(true);
	
	
}

}

