package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> llista = new ArrayList<>();
        llista.add("itAcademy");
        llista.add("tres");
        llista.add(2);
        llista.add("hello");
        llista.add(1);
        
        llista.sort(Comparator.comparingInt(o -> -o.toString().length()));
        
        System.out.println(llista);
		
	}

	//Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.
	
}
