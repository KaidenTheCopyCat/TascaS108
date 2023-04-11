package n1exercici5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PiValue piValue = () -> 3.1415;
        double pi = piValue.getPiValue();
        System.out.println("Valor de pi: " + pi);
		
	}

	/*
	 * Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. 
	 * Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. 
	 * Invoca el mètode getPiValue() i imprimeix el resultat.
	 */
	@FunctionalInterface
	interface PiValue {
	    double getPiValue();
	}
	
}
