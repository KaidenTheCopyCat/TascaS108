package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nomMesos = Arrays.asList("Gener", "Febrer", "Marc", "Abril", "Maig", "Juny", "Juliol",
                "Agost", "Septembre", "Octobre", "Novembre", "Decembre");

        nomMesos.forEach(System.out::println);
		
	}

	//Fer la mateixa impressió del punt anterior, però mitjançant method reference. 
}
