import java.util.HashMap;

public class p765 {

	static java.util.Scanner in;

	public static boolean casoDePrueba() {
		int numVotos = in.nextInt();
		if (numVotos == 0) {
			return false;
		} else {
			//Guardar los votos en un Map
			HashMap<String, Integer> mapVotos = new HashMap<String, Integer>();
			for (int i = 0; i < numVotos; i++) {
				String voto = in.next();
				if (mapVotos.containsKey(voto)) {
					mapVotos.put(voto, mapVotos.get(voto) + 1);
				} else {
					mapVotos.put(voto, 1);
				}
			}
			//Obtener el maximo de votos y el ganador
			int maxVotosAdulto = 0, maxVotosInfantil = 0;
			String ganadorAdulto = null, ganadorInfantil = null;
			for (String clave : mapVotos.keySet()) {
				if(Character.isUpperCase(clave.charAt(0)) && mapVotos.get(clave) > maxVotosAdulto ) {
					maxVotosAdulto = mapVotos.get(clave);
					ganadorAdulto = clave;
				} else if(Character.isUpperCase(clave.charAt(0)) && mapVotos.get(clave) == maxVotosAdulto) {
					ganadorAdulto = "EMPATE";
				}
				if(Character.isLowerCase(clave.charAt(0)) && mapVotos.get(clave) > maxVotosInfantil ){
					maxVotosInfantil = mapVotos.get(clave);
					ganadorInfantil = clave;
				} else if(Character.isLowerCase(clave.charAt(0)) && mapVotos.get(clave) == maxVotosInfantil) {
					ganadorInfantil = "empate";
				}
			}
		
			System.out.println(ganadorInfantil +  " " + ganadorAdulto) ;		
			return true;
		}
	}

	public static void main(String[] args) {
		in = new java.util.Scanner(System.in);
		while (casoDePrueba()) {
		}
	}

}
