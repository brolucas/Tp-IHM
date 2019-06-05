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

public class Fenetretamere extends JFrame implements ActionListener{

private JButton Couleur;
	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if (source == Couleur){
			Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);	
		}
		
	}





	public Fenetretamere(){
	super("Paint");
	this.init();
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	this.setVisible(true);
	
	
	}


	public void init(){
		this.setLayout(new BorderLayout());
		this.add(PanneauNord(), BorderLayout.NORTH);
		//this.add(PanneauCentre(), BorderLayout.CENTER);
	}



	public JPanel PanneauNord(){
		JPanel pn = new JPanel();
		//TODO Combobox forme
		String[] Forme = {"rectangle","Triangle","Cercle","Ellipse","Carre"};
		JComboBox forme = new JComboBox(Forme);
		pn.add(forme);
		//TODO Couleur
		Couleur = new JButton("Couleur");
		Couleur.addActionListener(this);
		pn.add(Couleur);
		return pn ;
		





	}
	public static void main(String[] args){
	 new Fenetretamere();
	}

}
