package com.methodes.java;

public class MethodesDemo {
	// Methode static pour additionner deux entiers
	public static int addition(int a, int b) {
		return a + b; // Returne la somme de a et b
	}

	// Methode static pour afficher un message
	public static void printMessage(String message) {
		System.out.println(message); // Affiche le message
	}

	// Methode d'instance pour afficher un message avec un prefixe
	public void displayMessage(String prefix, String message) {
		System.out.println(prefix + message); // Affiche le message avec un prefixe
	}

	public static void updateArray(int[] arr) {
		arr[0] = 100;
	}

	public int calculateSomme(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Appel de la methode static addition
		int result = addition(5, 10); // Utilisation de la methode addition
		// Affiche la resultat de l'addition
		System.out.println("le resultat de l'addition est " + result);
		// Appel de la methode static printMessage
		printMessage("khouloud"); // Utilisation de la methode printMessage
		// creation d'un tableau d'entiers
		int[] MyArray = { 1, 2, 3 };
		// Appel a la methode static updateArray
		updateArray(MyArray); // Modifie le premier element de tableau
		// Affiche le premier element du tableau apres modification
		System.out.println("premier element du tableau après modification: " + MyArray[0]);
		// Creation d'une instance pour les methodes d'instance
		MethodesDemo demo = new MethodesDemo();
		// Appel de la methode d'instance calculateSomme
		int somme = demo.calculateSomme(5, 8);
		System.out.println(somme);
		// Appel de la methode d'instance displayMessage
		demo.displayMessage("1", "khouloud");

	}

}
