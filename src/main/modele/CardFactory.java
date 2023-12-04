package main.modele;
import java.util.*;

public class CardFactory {
	private static CardFactory instance;
	
	private CardFactory() {
		
	}
	public static CardFactory getInstance() {
		if(instance==null) {
			instance=new CardFactory();
		}
		return instance;
		
	}
	
	/**creation des carte de destinée*/
	public List<Carte> createDestinee(){
		Carte carte=new Carte(EnumCouleur.Bleu, 2, "Destinee") {
			public void usePouvoir(Joueur user, Joueur victim) {
				System.out.println("j'utilise ce pouvoir de destinée");
			}
			
		};
		ArrayList<Carte> liste=new ArrayList<Carte>();
		for(int i=0; i<3;i++) {
			liste.add(carte);
		}
		return liste;
	}
	
	/** creation des carte de coup d'oeil*/
	public List<Carte> createCoupOeil(){
		Carte carte=new Carte(EnumCouleur.Bleu, 1, "coup d'oeil") {
			public void usePouvoir(Joueur user, Joueur victim) {
				System.out.println("j'utilise ce pouvoir du coup d'oeil");
			}
			
		};
		ArrayList<Carte> liste=new ArrayList<Carte>();
		for(int i=0; i<3;i++) {
			liste.add(carte);
		}
		return liste;
		
	}
	
	/** creation des carte de transmigration*/
	public List<Carte> createTransmigrate(){
		Carte carte=new Carte(EnumCouleur.Bleu, 1, "transmigrate") {
			public void usePouvoir(Joueur user, Joueur victim) {
				System.out.println("j'utilise ce pouvoir de transmigration");
			}
			
		};
		ArrayList<Carte> liste=new ArrayList<Carte>();
		for(int i=0; i<3;i++) {
			liste.add(carte);
		}
		return liste;
		
	}
	
	
	
	/**remplissage de la source de jeux*/
	public void remplissageCarte(List<Carte> source) {
		source.addAll(this.createDestinee());
		source.addAll(createCoupOeil());
		source.addAll(createTransmigrate());
	}
	
	
	
	

}
