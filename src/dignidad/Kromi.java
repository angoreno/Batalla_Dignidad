package dignidad;

import java.util.*;

public class Kromi extends Carro {

	private int anoFabri = 1942;
	private String marca = "Marca Chancho";

	private String tabla[][];

	int kromiUbi1[]= new int [3];
	int kromiUbi2[]= new int [4];
	int kromiUbi3[]= new int [4];
	int a;
	int b;

	Random corde = new Random();
	// int[] kromiUbi= {};

	ArrayList<String> kromiUbi = new ArrayList<String>(3);

	public Kromi() {
		
		
		
		
		
	}

	public void kromi(String[][] tab) {

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

				if (cont == 1) {
					kromiUbi1[0] = cont;
					kromiUbi1[1] = a;
					kromiUbi1[2] = b;

					if (cont == 2) {

						kromiUbi2[0] = cont;
						kromiUbi2[1] = a;
						kromiUbi2[2] = b;

						if (cont == 3) {

							kromiUbi3[0] = cont;
							kromiUbi3[1] = a;
							kromiUbi3[2] = b;
						}

					}
				}

				/*
				 * String a1 = ""+a; String b1 = ""+b;
				 * 
				 * kromiUbi.add(a1);
				 */

			}
		} while (cont < 3);

		tabla = tab;

	}

	public String[][] tableroKromi() {

		return tabla;
	}

	//salida de los 3 objetos
	public int[] entraLKromi1() {

		return kromiUbi1;
	}

	public int[] entraLKromi2() {

		return kromiUbi2;
	}

	public int[] entraLKromi3() {

		return kromiUbi3;
	}
}