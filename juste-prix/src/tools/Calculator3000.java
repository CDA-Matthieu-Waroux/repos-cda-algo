package tools;

import java.util.Random;

import verif.Verification;

public class Calculator3000 {
	private static int compteur = 0;
	private static boolean boucle = false;
	private static int nombreMystere;
	private static int MAX=50000;
	private static int MIN=10000;

	public static int nombreRandom(int min, int max) {
		Random rdn = new Random();
		int random = rdn.nextInt(max - min + 1) + min;
		return random;
	}

	public static void jeu(int entree) {
		nombreMystere = nombreRandom(MIN, MAX);
		while (boucle == false) {
			if (Verification.verifCompteur(compteur)) {
				System.out.println("----------------------");
				System.out.println("Vous avez épuisé vos essaie");
				System.out.println("Vous avez donc perdu !");
				break;
			}
			if (Verification.verifEntree(MAX, MIN)) {

				System.out.println("Erreur votre nombre n'est pas compris entre "+MIN+"et "+MAX);
				entree = EntreeClavier.entreeclavier();
			}

			if (entree == nombreMystere) {
				System.out.println("----------------------");
				System.out.println("Félicitation vous avez gagnez en " + (compteur+1) + " essai(s)");
				System.out.println("Vous pouvez demander un petit pains à Isame !");
				break;
			}
			if (entree > nombreMystere) {

				System.out.println("C'est plus petit !");
				compteur++;
				entree = EntreeClavier.entreeclavier();
			}
			if (entree < nombreMystere) {

				System.out.println("C'est plus grand !");
				compteur++;
				entree = EntreeClavier.entreeclavier();
			}
		}
	}
}
