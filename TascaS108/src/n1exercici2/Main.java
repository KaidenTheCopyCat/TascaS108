package n1exercici2;

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
                .filter(str -> str.contains("o") && str.length() > 5)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

	/*
	 * Has de fer el mateix que en el punt anterior, però ara, 
	 * el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ 
	 * també tenen més de 5 lletres. Imprimeix el resultat.
	 */
	
}
