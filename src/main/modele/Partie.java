package main.modele;
import java.util.*;

public class Partie {
	private static Partie instancePartie;
	private Joueur player;
	private Joueur computerPlayer;
	private LinkedList<Carte> source;
	private ArrayList<Carte> fausse;
	
	private Partie(Joueur player1, Joueur player2) {
		this.player=player1;
		this.computerPlayer=player2;
		this.source= new LinkedList<Carte>();
		this.fausse= new ArrayList<Carte>();
		
	}
	
	public Joueur getComputer() {
		return this.computerPlayer;
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
	
	public  void ajouterCarte(List<Carte> carte) {
		this.source.addAll(carte);
		
	}
	
	
	public void distribuerCarte() {
		int compteur =0;
		Collections.shuffle(source);
		
		while(compteur<2) {
			Carte carte1=source.poll();
			Carte carte2=source.poll();
			this.player.ajouterCarteMain(carte1);
		    this.computerPlayer.ajouterCarteMain(carte2);
			compteur++;
			
			
		}
		compteur =0;
		
		/**remplissage des piles des fifférents joueurs*/
		while(compteur<1) {
			Carte carte1=source.poll();
			Carte carte2=source.poll();
			this.player.ajouterCartePile(carte1);
			this.computerPlayer.ajouterCartePile(carte2);
			compteur++;	
		}	
		
	}
	public static void main(String[] args) {
		CardFactory factory=CardFactory.getInstance();
		
		System.out.println("une modification");
		
		JoueurPhysique player1=new JoueurPhysique("brian");
		Joueur player2=new Joueur("charlet");
		
		Partie partie=Partie.getInstancePartie(player1, player2);
		
		
		factory.remplissageCarte(partie.source);
		
		
		partie.distribuerCarte();
		
		//affichage de la main d'un joueur apreès distribution de carte
		//System.out.println(player1);
		
		//test de la methode de jouerOeuvre
		player1.play();
		
		//test de la methode de calcul du nombre de points 
		int a=player1.calculMaxPointOeuvre();
		
		System.out.println("pour le joueur 1 , le nombre max de point est "+a);
		
		
	
		
		
		
	}
	

}


