package main.modele;
import java.util.*;

public class JoueurPhysique extends Joueur implements Strategie {
	public JoueurPhysique(String nomJoueur) {
		super(nomJoueur);
	}
	public Carte play() {
		if(this.checkMain()==false && this.checkPile()==false) {//cas ou le joueur n'a de carte ni dans sa pile ni dans sa main , reincarnation
			
			
		}
		
		
		else {//cas ou le joueur a au moins une carte dans sa pile ou dans sa main
			boolean actionPioche=false;
			if(this.checkPile()==true) {//pioche une carte dans la pile si il y'en a
				this.ajouterCarteMain(this.piocherPile());
				actionPioche=true;
			}
			
			//le joueur joue son tour
			Joueur victim=Partie.getInstancePartie(null, null).getComputer();
			Scanner sc=new Scanner(System.in);
			System.out.println(this);
			System.out.println(" veillez entrer le numero de la carte à jouer \n");
			int ind=sc.nextInt();
			
			System.out.println("veillez entrer le numero du coup que vous voulez jouer: \n 1. jeux Oeuvre \n 2. jeux vie future \n3. jeux pouvoir\n>");
			int jeu=sc.nextInt();
			sc.close();
			
			switch(jeu) {
			case 1:
				this.jouerOeuvre(getMain().get(ind));
				break;
			case 2:
				this.jouerVieFuture(getMain().get(ind));
			case 3:
				this.jouerPouvoir(getMain().get(ind), victim);
			}
			
			System.out.println("/*******vous avez joué votre tour*******/");
			System.out.println(this);
		}
		
		
		
		
		
		return null;
	}

}
  

