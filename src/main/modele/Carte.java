package main.modele;

public class Carte {
	private EnumCouleur couleur;
	private int nbPoint;
	private String description;
	private PouvoirCarte pouvoir;
	public Carte(EnumCouleur couleur, int nbPoint, String description, PouvoirCarte pouvoir) {
		this.couleur=couleur;
		this.nbPoint=nbPoint;
		this.description=description;
		this.pouvoir=pouvoir;	}
	
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
		return "description: "+this.description+", pouvoir: "+this.pouvoir+", nbPoint: "+this.nbPoint;
	}
	public PouvoirCarte getPouvoir() {
		return this.pouvoir;
	}
	
	
	

}
