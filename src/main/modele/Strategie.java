package main.modele;
import java.util.*;
public interface Strategie {
	public Carte play(List<Carte> donneur, List<Carte> receveur, int indice);

}
