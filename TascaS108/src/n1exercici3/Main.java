package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> nomMesos = Arrays.asList("Gener", "Febrer", "Marc", "Abril", "Maig", "Juny", "Juliol",
                "Agost", "Septembre", "Octobre", "Novembre", "Decembre");

        nomMesos.forEach(mes -> System.out.println(mes));
		
	}

	//Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.
	
}
