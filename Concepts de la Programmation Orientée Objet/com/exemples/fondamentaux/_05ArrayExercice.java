package com.exemples.fondamentaux;

public class _05ArrayExercice {

	public static void main(String[] args) {
		// Déclaration et initialisation d'un tableau d'entiers
		int[] notes = { 5, 4, 8, 7, 9 }; // Tableau contenant les noms des étudiants
		int somme = 0; // Variable pour stocker la somme des notes
		System.out.println(notes.length);
		// calcul la somme des notes en utilisant boucle for
		for (int i = 0; i < notes.length; i++) {
			somme += notes[i]; // Aditionne chaque note à la somme
		}
		// conversion en double pour éviter la division entière
		double moyenne = (double) somme / (double) notes.length;
		// Affichage de la moyenne des notes
		System.out.println("la moyenne des notes est :" + moyenne);
	}

}
