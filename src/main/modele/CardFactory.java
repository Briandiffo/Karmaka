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
	
	public List<Carte> createDestinee(){
		Carte carte=new Carte(EnumCouleur.Bleu, 2, "Destinee") {
			public void usePouvoir(Joueur user, Joueur victim) {
				System.out.println("j'utilise ce pouvoir");
			}
			
		};
		ArrayList<Carte> liste=new ArrayList<Carte>();
		for(int i=0; i<3;i++) {
			liste.add(carte);
		}
		return liste;
	}
	
	
	
	

}
