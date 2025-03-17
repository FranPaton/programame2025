
public class p223 {
	static java.util.Scanner in;

	public static void casoDePrueba() {
		int limite = in.nextInt();
		int numeros[] = new int[limite];
		for (int i = 0; i < limite; i++) {
			numeros[i] = in.nextInt();
		}
		
		int limiteIzq = 0, limiteIzqMax = -1, maxMulti = 0, contMulti = 0;
		for(int i=0; i<limite;i++) {
			if(numeros[i] == 0) {
				contMulti = i - limiteIzq;
				if(contMulti > maxMulti){
					maxMulti = contMulti;
					limiteIzqMax = limiteIzq;
				}
				limiteIzq = i + 1;
			}
		}
		// Controlar la ultima secuencia despues del 0, o toda la secuencia si no hay 0
		contMulti = limite - limiteIzq;
		if(contMulti > maxMulti) {
			maxMulti = contMulti;
			limiteIzqMax = limiteIzq;
		}
				
	/*	for(int i=0; i<limite; i++) {
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
		}*/
		
		if(maxMulti > 0 ) {		
			int limiteDer = limiteIzqMax + maxMulti - 1;
			System.out.println(maxMulti + " -> " + "[" + limiteIzqMax + "," + limiteDer + "]");
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
