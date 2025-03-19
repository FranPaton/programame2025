public class p763 {

	static java.util.Scanner in;

	public static void casoDePrueba() {
		String palabra = in.next().toLowerCase();
		System.out.println(palabra.equals("colgadas") ? "Bien" : "Mal");	
	}
	
	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();

	}

}
