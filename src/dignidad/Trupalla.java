package dignidad;

import java.util.*;

public class Trupalla extends Carro {
	
	/**
	 * Trupalla
	 * Atributos y metodos Caguano
	 * Ubicación en tablero y creación de vehiculos de Trupalla
	 */

	private String tabla[][];

	Random corde = new Random();
	ArrayList<String> trupallaUbi = new ArrayList<String>();

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

				trupallaUbi.add(cont + "," + a + "," + b);

			}

		} while (cont < 10);

		tabla = tab;

	}

	public String[][] tableroTrupalla() {

		return tabla;
	}

	public ArrayList<String> entregaListaTrupalla() {

		return trupallaUbi;
	}
}
