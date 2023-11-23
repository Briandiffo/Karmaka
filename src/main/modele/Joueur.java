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
		this.oeuvre=new ArrayList<Carte>();
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
	
	public List<Carte> getPile(){
		return this.pile;
	}
	
	public List<Carte> getVieFuture(){
		return this.vieFuture;
	}
	
	public List<Carte> getOeuvre(){
		return this.oeuvre;
	}
	
	public void ajouterCarteMain(Carte carte) {
		this.main.add(carte);
	}
	
	public void ajouterCartePile(Carte carte) {
		this.pile.add(carte);
	}
	
	public void ajouterCarteOeuvre(Carte carte) {
		this.oeuvre.add(carte);
	}
	
	public void ajouterCarteVieFuture(Carte carte) {
		this.vieFuture.add(carte);
	}
	
	//implementer les différents coups possibles 
	public Carte jouerVieFuture(Carte carteJoue) {
		this.main.remove(carteJoue);
		this.vieFuture.add(carteJoue);
		return carteJoue;
	}
	
	public Carte jouerOeuvre(Carte carteJoue) {
		this.main.remove(carteJoue);
		this.oeuvre.add(carteJoue);
		return carteJoue;
	}
	
	public Carte jouerPouvoir(Carte carteJoue) {
		this.main.remove(carteJoue);
		return carteJoue;
	}
	
	/** calcul du nombre de point par couleur pour l'oeuvre d'un joueur*/
	public Map<String, Integer> calculPointOeuvre() {
		Iterator<Carte> it=this.oeuvre.iterator();
		int rouge=0;
		int bleu=0;
		int vert=0;
		int mosaique=0;
		while(it.hasNext()) {
			Carte carte=it.next();
			if(carte.getCouleur()==EnumCouleur.Bleu) {
				bleu+=carte.getnbPoint();
			}
			if(carte.getCouleur()==EnumCouleur.Rouge) {
				rouge+=carte.getnbPoint();
			}
			
			if(carte.getCouleur()==EnumCouleur.Vert) {
				vert+=carte.getnbPoint();
			}
			
			if(carte.getCouleur()==EnumCouleur.Mosaique) {
				mosaique+=carte.getnbPoint();
			}
			
		}
		
		HashMap<String, Integer> pointTable=new HashMap<String, Integer>();
		pointTable.put("point Bleu", bleu);
		pointTable.put("point Rouge", rouge);
		pointTable.put("point Vert", vert);
		pointTable.put("point Mosaique", mosaique);
		return pointTable;
		
	}
	/**calcul du maximum de point pour une couleur de l'oeuvre au cas ou le joueur veut se réincarner*/
	public int calculMaxPointOeuvre() {
		Map<String, Integer> pointOeuvre=this.calculPointOeuvre();
		HashSet<String> keys=new HashSet<String>();
		keys.addAll(pointOeuvre.keySet());
		int max=0;
		for(String key:keys) {
			if(pointOeuvre.get(key)>max) {
				max=pointOeuvre.get(key);
			}
		}
		System.out.println(pointOeuvre.toString());
		
		max=max+pointOeuvre.get("point Mosaique");
		return max;
		
	}
	
	
}
