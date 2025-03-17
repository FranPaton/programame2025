
public class p223 {
	static java.util.Scanner in;

	public static void casoDePrueba() {
		int limite = in.nextInt();
		int numeros[] = new int[limite];
		for (int i = 0; i < limite; i++) {
			numeros[i] = in.nextInt();
		}
		
		
		int limiteIzq = 0, maxMulti = 0;
		for(int i=0; i<limite; i++) {
			for(int j=i; j<limite; j++) {
				boolean ceroEncontrado = false;
				for(int k=i; k<=j; k++) {
					if(numeros[k] == 0) {
						ceroEncontrado = true;
						break;
					}	
				}
				if(!ceroEncontrado) {
					int contMulti = j - i + 1;
					if(contMulti > maxMulti){
						maxMulti = contMulti;
						limiteIzq = i;
					}			
				}
			}
		}
		int limiteDer = limiteIzq + maxMulti - 1;
		if(maxMulti > 0 ) {			
			System.out.println(maxMulti + " -> " + "[" + limiteIzq + "," + limiteDer + "]");
		} else {
			System.out.println("SIGUE BUSCANDO");
		}
			
		// TU CÓDIGO AQUÍ

	} // casoDePrueba

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		int numCasos = in.nextInt();
		for (int i = 0; i < numCasos; i++)
			casoDePrueba();
	}
	
}
