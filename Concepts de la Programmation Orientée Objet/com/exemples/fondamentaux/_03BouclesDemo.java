package com.exemples.fondamentaux;

public class _03BouclesDemo {

	public static void main(String[] args) {
		// Affichage de Boucle for :
		System.out.println("Boucle for:");
		// Initialisation, condition et mise à jour
		for (int i = 0; i <= 5; i++) {
			// Affichage de la valeur de i
			System.out.println("i=" + i);
		}
		// Affichage de Boucle while
		System.out.println("Boucle while:");
		int j = 0; // Initialisation
		while (j < 5) { // condition
			System.out.println("j=" + j);
			j++; // Mise à jour
		}
		System.out.println("Boucle do while :");
		int k = 0; // Intialisation
		do {
			System.out.println("K=" + k); // Affichage de la valeur de K
			k++; // Mise à jour
		} while (k < 5); // condition
		// Affichage de Boucle for avec break
		System.out.println("Boucle for avec break:");
		for (int i = 0; i < 5; i++) {
			// à chaque itération, la valeur de i est affiché
			System.out.println("i=" + i);
			// si i atteint 3, le boucle s'arréte
			if (i == 3) {
				break;

			}
		}

	}

}
