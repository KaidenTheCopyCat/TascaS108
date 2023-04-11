package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] llistaStrings = {"hello", "world", "java", "programar","ItAcademy"};
        List<String> oStrings = trobaStringsAmbO(llistaStrings);
        System.out.println(oStrings);
    }

    public static List<String> trobaStringsAmbO(String[] strings) {
        return Arrays.stream(strings)
                .filter(str -> str.contains("o"))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }


	/* A partir d’una llista de Strings, 
	escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’.
	 Imprimeix el resultat.
	*/
}
