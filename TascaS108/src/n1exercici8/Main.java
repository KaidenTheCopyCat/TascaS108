package n1exercici8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DelReves delReves = s -> new StringBuilder(s).reverse().toString();

	        String original = "Hello, world!";
	        String reversed = delReves.reverse(original);
	        
	        System.out.println("Original: " + original);
	        System.out.println("Del reves: " + reversed);
	    		
	}

	@FunctionalInterface
	interface DelReves {
	    String reverse(String s);
	}
	
	/*
	 * Crea una Functional Interface que contingui un mètode anomenat reverse(). 
	 * Aquest mètode ha de rebre i ha de retornar un String. 
	 * En el main() de la classe principal, injecta a la interfície creada mitjançant una lambda, 
	 * el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés.
	 * Invoca la instància de la interfície passant-li una cadena i comprova si el resultat és correcte.
	 */
	
}
