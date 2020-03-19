package start;

import tools.Calculator3000;
import tools.EntreeClavier;

public class Jeu {

	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		System.out.println("--------------------------");
		System.out.println("Bienvenue dans le jeu du juste prix");
		System.out.println("Vous devez deviner le nombre mystère compris entre 10000 et 50000");
		int entree=EntreeClavier.entreeclavier();
		
		Calculator3000.jeu(entree);
	}
}
