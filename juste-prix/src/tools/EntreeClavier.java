package tools;

import java.util.Scanner;

public class EntreeClavier {
	private static int entree;
	private static Scanner sc = new Scanner(System.in);

	public static int entreeclavier() {

		System.out.println("----------------------");
		System.out.println("Veuillez rentrez votre chiffre");
		entree = sc.nextInt();

		return entree;
	}

}
