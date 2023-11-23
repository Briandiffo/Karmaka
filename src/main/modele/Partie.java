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
		/*Carte carte1=new Carte(EnumCouleur.Bleu, 2, "chat");
		Carte carte2=new Carte(EnumCouleur.Vert, 3, "chaton");
		Carte carte3=new Carte(EnumCouleur.Rouge, 7, "charle");
		Carte carte4=new Carte(EnumCouleur.Bleu, 1, "chien");
		Carte carte5=new Carte(EnumCouleur.Mosaique, 9, "chatie");
		Carte carte6=new Carte(EnumCouleur.Bleu, 0, "chatparp");
		Carte carte7=new Carte(EnumCouleur.Mosaique, 2, "chat");
		*/
		System.out.println("une modification");
		
		Joueur player1=new Joueur("brian");
		Joueur player2=new Joueur("charlet");
		
		Partie partie=Partie.getInstancePartie(player1, player2);
		
		/*partie.ajouterCarte(carte1);
		partie.ajouterCarte(carte2);
		partie.ajouterCarte(carte3);
		partie.ajouterCarte(carte4);
		partie.ajouterCarte(carte5);
		partie.ajouterCarte(carte6);
		partie.ajouterCarte(carte7);*/
		partie.ajouterCarte(factory.createDestinee());
		partie.ajouterCarte(factory.createDestinee());
		partie.ajouterCarte(factory.createDestinee());
		
		
		partie.distribuerCarte();
		
		//affichage de la main d'un joueur apreès distribution de carte
		System.out.println(player1.getMain());
		
		//test de la methode de jouerOeuvre
		player1.jouerOeuvre(player1.getMain().get(0));
		player1.jouerOeuvre(player1.getMain().get(0));
		System.out.println(player1.getMain());
		
		//test de la methode de calcul du nombre de points 
		int a=player1.calculMaxPointOeuvre();
		player2.getMain().get(1).usePouvoir(player2, player1);
		System.out.println("pour le joueur 1 , le nombre max de point est "+a);
		
		
	
		
		
		
	}
	

}


