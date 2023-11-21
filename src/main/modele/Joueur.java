package main.modele;
import java.util.*;

public class Joueur {
	final private String nomJoueur;
	private ArrayList<Carte> main;
	private ArrayList<Carte> pile;
	private ArrayList<Carte> oeuvre;
	private ArrayList<Carte> vieFuture;
	private EnumEtat etatJoueur;
	
	public Joueur(String nomJoueur) {
		this.nomJoueur=nomJoueur;
		this.etatJoueur=EnumEtat.Bousier;
		this.main= new ArrayList<Carte>();
		this.pile=new ArrayList<Carte>();
	}
	
	public Carte recupererCarteMain(int i) {
		Carte carte;
		carte=this.main.get(i);
		this.main.remove(i);
		return carte;
	}
	
	public Carte recupererCartePile(int i) {
		Carte carte;
		carte=this.pile.get(i);
		this.main.remove(i);
		return carte;
	}
	
	public Carte recupererCarteOeuvre(int i) {
		Carte carte;
		carte=this.oeuvre.get(i);
		this.main.remove(i);
		return carte;
	}
	
	
	public Carte recupererCarteVieFuture(int i) {
		Carte carte;
		carte=this.vieFuture.get(i);
		this.main.remove(i);
		return carte;
	}
	public List<Carte> getMain(){
		return this.main;
	}
	
	//implementer les différents coups possibles 
	public Carte jouerVieFuture();
	
	public Carte jouerOeuvre();
	
	public Carte jouerPouvoir();
	
	
	
}
