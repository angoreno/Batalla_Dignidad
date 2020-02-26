package dignidad;

import java.util.*;

public class Trupalla extends Carro {

	private String tabla[][];

	Random corde = new Random();

	public Trupalla() {

	}

	public void Trupalla(String[][] tab) {

		int a;
		int b;
		int cont = 0;

		do {

			a = 1 + corde.nextInt(15);
			b = 1 + corde.nextInt(15);
			
			if (tab[a][b].equals("~")) {
			
				String letra = "T";
				tab[a][b] = letra;
				cont = cont + 1;
			
				tab = tab;
			}
			 
		} while (cont < 10);

		tabla = tab;

	}

	public String[][] tableroTrupalla() {

		return tabla;
	}
}
