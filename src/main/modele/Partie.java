package main.modele;
import java.util.*;

public class Partie {
	private static Partie instancePartie;
	private Joueur player;
	private Joueur computerPlayer;
	private LinkedList<Carte> source;
	
	private Partie(Joueur player1, Joueur player2) {
		this.player=player1;
		this.computerPlayer=player2;
		this.source= new LinkedList<Carte>();
		
	}
	
	public static Partie getInstancePartie(Joueur player1, Joueur player2) {
		if(instancePartie==null) {
			instancePartie=new Partie(player1, player2);
			return instancePartie;
			
			
		}
		else {
			return instancePartie;
		}
		
	}
	
	public  void ajouterCarte(Carte carte) {
		this.source.add(carte);
		
	}
	
	public void distribuerCarte() {
		int compteur =0;
		Collections.shuffle(source);
		
		while(compteur<2) {
			Carte carte1=source.poll();
			Carte carte2=source.poll();
			//this.player.ajouterCarteMain(carte1);
			//this.computerPlayer.ajouterCarteMain(carte2);
			compteur++;
			
			
		}
		compteur =0;
		
		/**remplissage des piles des fifférents joueurs*/
		while(compteur<1) {
			Carte carte1=source.poll();
			Carte carte2=source.poll();
			//this.player.ajouterCartePile(carte1);
			//this.computerPlayer.ajouterCartePile(carte2);
			compteur++;	
		}	
		
	}
	public static void main(String[] args) {
		PouvoirCarte p=new PouvoirCarte();
		Carte carte1=new Carte(EnumCouleur.Bleu, 2, "chat", p);
		Carte carte2=new Carte(EnumCouleur.Bleu, 3, "chaton", p);
		Carte carte3=new Carte(EnumCouleur.Bleu, 7, "charle", p);
		Carte carte4=new Carte(EnumCouleur.Bleu, 1, "chien", p);
		Carte carte5=new Carte(EnumCouleur.Bleu, 9, "chatie", p);
		Carte carte6=new Carte(EnumCouleur.Bleu, 0, "chatparp", p);
		Carte carte7=new Carte(EnumCouleur.Bleu, 2, "chat",p);
		carte1.getPouvoir().destine();
		
		/*Joueur player1=new Joueur("brian");
		Joueur player2=new Joueur("charlet");
		
		Partie partie=Partie.getInstancePartie(player1, player2);
		partie.ajouterCarte(carte1);
		partie.ajouterCarte(carte2);
		partie.ajouterCarte(carte3);
		partie.ajouterCarte(carte4);
		partie.ajouterCarte(carte5);
		partie.ajouterCarte(carte6);
		partie.ajouterCarte(carte7);
		
		partie.distribuerCarte();
		System.out.println(player1.getMain());
		System.out.println(player2.getMain());*/
		
	
		
		
		
	}
	

}

