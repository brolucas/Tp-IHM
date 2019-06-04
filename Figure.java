import java.awt.Graphics;
import java.util.* ; 
import javax.swing.* ;
import java.awt.Point; 
public class Figure{
	// TODO Creer l'ArrayList Figure

	private ArrayList<Figure> ListeFig = new ArrayList<Figure>(); 

	// TODO Initialiser les parametres des figures
	
	private int nbrP;
	private int nbrA ;
	private String forme ;
	private float x ;
	private float y ; 
	
// TODO Createur 
public Figure(int nbrP, int nbrA,String forme){
this.nbrP = nbrP;
this.nbrA = nbrA;
this.forme = forme ;
// TODO Accesseurs 	
}
public float getx(){
	return x ;

}
public void setx(float x){
	this.x = x ;
	
}
public float gety(){
	return y ;

}
public void sety(float y){
	this.y = y ;
	
}
public int getnbrP(){
	return nbrP ;

}
public void setnbrP(int nbrP){
	this.nbrP = nbrP ;
	
}

public int getnbrA(){
	return nbrA ;

}
public void setnbrA(int nbrA){
	this.nbrA = nbrA ;

}
public void setforme(String forme){
	this.forme = forme;

}
public String getforme(){
	return forme ;
}


public static void main(String[] args){
	// TODO remplir l'ArrayList
	Figure rectangle = new Figure(4,4,"rectangle") ;
	Figure Triangle = new Figure(3,3,"Triangle");
	Figure Cercle = new Figure(1,0,"Cercle");
	//ListeFig.add(rectangle);
	//ListeFig.add(Triangle);
	//ListeFig.add(Cercle);
	System.out.println(Cercle);



	
}
}




