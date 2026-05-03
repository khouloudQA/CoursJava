package com.exemples.fondamentaux;

public class _02VariablesEtTypesDeDonnees {

	// Variable Global (de classe)
	static String globalMessage = "ceci est une variable globale";

	public static void main(String[] args) {

		int age = 25; // variable local de type entier*
		double pi = 3.14; // variable local de type double*
		boolean isJavaFun = false; // variable local de type boolean*
		boolean estsuperieur = age < 3; // variable local de type boolean*
		String message = "Java est genial"; // variable local de type chaine des caractères*
		
		System.out.println(globalMessage); // utilisation et affichage du message de la variable global*
		// [Type de variable] [Nom] = [valeur dépend de type]
		double result = (double) age * pi;
		System.out.println(result);
		String newMessage = message + " je suis entrain d'apprendre";
		System.out.println(newMessage);
		if (isJavaFun) {
			System.out.println("Java est amusant");
		} else {
			System.out.println("Java n'est pas amusant");
		}
		System.out.println(estsuperieur);
	}
}
