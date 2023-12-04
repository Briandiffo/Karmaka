package main.modele;

public class Carte {
	private EnumCouleur couleur;
	private int nbPoint;
	private String description;
	
	public Carte(EnumCouleur couleur, int nbPoint, String description) {
		this.couleur=couleur;
		this.nbPoint=nbPoint;
		this.description=description;
			}
	
	public EnumCouleur getCouleur() {
		return this.couleur;
	}
	
	public int getnbPoint() {
		return this.nbPoint;
	}
	
	public String getDescription() {
		return this.description;
	}
	public String toString() {
		//return "description: "+this.description+", pouvoir: "+", nbPoint: "+this.nbPoint;
		return"[**"+this.description+"\n"+this.couleur+"\n"+"points: "+this.nbPoint+"**]\n";
	}
	public void usePouvoir(Joueur user, Joueur victim) {
		System.out.println("i am using it");
		
	}
	
	
	
	

}
