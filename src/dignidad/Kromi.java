package dignidad;

import java.util.*;

public class Kromi extends Carro {

	private int anoFabri = 1942;
	private String marca = "Marca Chancho";

	private String tabla[][];

	Random corde = new Random();

	public Kromi() {

	}

	public void kromi(String[][] tab) {

		int a;
		int b;
		int cont = 0;

		do {

			a = 1 + corde.nextInt(13);
			b = 1 + corde.nextInt(15);

			if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")) {

				tab[a][b] = "K";
				tab[a + 1][b] = "K";
				tab[a + 2][b] = "K";
				cont = cont + 1;
				tab = tab;
			}
		} while (cont < 3);

		tabla = tab;

	}

	public String[][] tableroKromi() {

		return tabla;
	}
}