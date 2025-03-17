public class p219 {

	static java.util.Scanner in;

    public static void casoDePrueba() {
    	int contPares = 0;
	//	in = new java.util.Scanner(System.in);
		int numDecimos = in.nextInt();	
    	for(int i=0; i < numDecimos; i++) {
    		int numero = in.nextInt();
    		if(numero % 2 == 0) {
    			contPares++;
    		}
    	}
    	System.out.println(contPares);
      
        // TU CÓDIGO AQUÍ

    } // casoDePrueba

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

	}

}
