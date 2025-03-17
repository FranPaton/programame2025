public class p272 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		StringBuilder numeroB6 = new StringBuilder();
		int numero = in.nextInt();
		while (numero > 0) {
			numeroB6.append(numero % 6);
			numero /= 6;
		}
		System.out.println(numeroB6.reverse());
	
	// TU CÓDIGO AQUÍ

	} // casoDePrueba
	
	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
