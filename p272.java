public class p272 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		StringBuilder numeroB6 = new StringBuilder();
		int numero = in.nextInt();
		int numAux = numero;
		while (numAux >= 6) {
			numeroB6.append(numAux % 6);
			numAux /= 6;
		}
		numeroB6.append(numAux);
		System.out.println(numeroB6.reverse());
	}
	
	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
