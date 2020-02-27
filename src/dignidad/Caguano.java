package dignidad;

import java.util.*;

public class Caguano extends Carro {

	private int alcanceTiro = 10;
	private String colorConfeti = "rojo";

	private String tabla[][];

	Random corde = new Random();
	ArrayList<String> caguanoUbi = new ArrayList<String>();

	public Caguano() {

	}

	public void Caguano(String[][] tab) {

		int a;
		int b;
		int cont = 0;

		do {

			a = 1 + corde.nextInt(15);
			b = 1 + corde.nextInt(14);

			if (tab[a][b].equals("~") && tab[a][b + 1].equals("~")) {

				tab[a][b] = "C";
				tab[a][b + 1] = "C";
				cont = cont + 1;
				tab = tab;
				
				caguanoUbi.add(cont+","+a+","+b);
				b++;
				caguanoUbi.add(cont+","+a+","+b);
				
			}
		} while (cont < 5);
		
		
		tabla = tab;

	}

	public String[][] tableroCaguano() {

		return tabla;
	}
	
	public ArrayList<String> entregaListaCaguano(){
	
		return caguanoUbi;
	}
		
		
}