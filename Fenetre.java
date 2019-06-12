import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Point; 
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fenetre extends JFrame implements ActionListener{

private JButton Couleur;
private JButton CouleurC;




	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if (source == Couleur){
			Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);	
		}
		else if (source == CouleurC){
			
			Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);	

		}
		
	}
	public void mouseClicked(MouseEvent e){
		Object source = e.getSource();
		e.getX();
		e.getY();
		
			
	}





	public Fenetre(){
	super("Paint");
	this.init();
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	this.setVisible(true);
	
	
	}


	public void init(){
		this.setLayout(new BorderLayout());
		this.add(PanneauNord(), BorderLayout.NORTH);
		this.add(PanneauCentre(), BorderLayout.CENTER);
	}



	public JPanel PanneauNord(){
		JPanel pn = new JPanel();
		//TODO Combobox forme
		String[] Forme = {"rectangle","Triangle","Cercle","Ellipse","Carre"};
		JComboBox forme = new JComboBox(Forme);
		pn.add(forme);
		//TODO Couleur Fond 
		Couleur = new JButton("Couleur Fond");
		Couleur.addActionListener(this);
		pn.add(Couleur);
		//TODO couleur contour
		CouleurC = new JButton("Couleur contour");
		CouleurC.addActionListener(this);
		pn.add(CouleurC);
		return pn ;
		
	}
	//TODO Panel centre
	public JPanel PanneauCentre(){
		JPanel pc = new JPanel();
		pc.setBackground(Color.WHITE);
		return pc ; 
		
	}
	//TODO Paint Component
	public void  paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g ;
		//super.paintComponent(g);


	}
	//TODO Main
	public static void main(String[] args){
	 new Fenetre();
	}

}
