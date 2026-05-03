package com.exemples.fondamentaux;

public class _04ControlConditionDemo {

	public static void main(String[] args) {
		int nombre = 15; // déclaration et intialisation de la variable

		// structure conditionnelle if-else
		if (nombre <= 20) { // condition vérifie si le nombre supèrieur à 10
			System.out.println("le nombre > 10"); // Exécution si la condition est vraie
		} else {
			System.out.println(" le nombre < 10"); // Exécution si la condition est fausse

		}
		switch (nombre) { // Teste de la valeur de la variable 'nombre'
		case 10:
			System.out.println("le nombre est 10"); // Exécution si le nombre == 10
			break; // Fin du case 10
		case 15:
			System.out.println("le nombre est 15"); // Exécution si le nombre == 15
			break; // Fin du case 15
		default:
			System.out.println("nombre inconnu"); // Exécution si aucune des valeurs ne correspond
			break; // Fin du case par default
		}
	}

}
