package main.modele;
import java.util.*;

public class JoueurPhysique extends Joueur implements Strategie {
	public JoueurPhysique(String nomJoueur) {
		super(nomJoueur);
	}
	public Carte play(List<Carte> donneur, List<Carte> receveur, int indice) {
		Carte carte=donneur.remove(indice);
		receveur.add(carte);
		
		
		return carte;
	}

}
