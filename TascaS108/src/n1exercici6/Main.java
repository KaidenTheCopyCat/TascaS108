package n1exercici6;

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
	        
	        llista.sort(Comparator.comparingInt(o -> o.toString().length()));
	        
	        System.out.println(llista);
		
	}

	//Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.
	
}
