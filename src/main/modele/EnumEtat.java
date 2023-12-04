package main.modele;

public enum EnumEtat {
	Bousier, serpent, loup, singe, transcendance;
	
	// Méthode pour obtenir l'état suivant
    public EnumEtat getNextState(EnumEtat currentState) {
        // Récupérer l'indice de l'état actuel
        int currentIndex = this.ordinal();

        // Calculer l'indice de l'état suivant (en prenant en compte le dépassement)
        int nextIndex = (currentIndex + 1) % values().length;

        // Récupérer l'état suivant en utilisant l'indice calculé
        EnumEtat nextState = values()[nextIndex];

        return nextState;
    }

}
