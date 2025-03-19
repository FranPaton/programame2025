
public class p764 {

	static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int numCasos = in.nextInt();
        if (numCasos == 0) {
        	//System.out.println("fin");
            return false;
        }
        else {
        	int totalAnilladas = 0;
        	for(int i=0; i<numCasos; i++) {
        		int capturadas = in.nextInt();
        		int anilladas = in.nextInt();
        		totalAnilladas += capturadas - anilladas;
        	}
        	System.out.println(totalAnilladas);
            return true;
         }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
