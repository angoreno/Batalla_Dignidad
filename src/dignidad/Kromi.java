package dignidad;

import java.util.*;

public class Kromi extends Carro {

	private int anoFabri = 1942;
	private String marca = "Marca Chancho";

	private String tabla[][];

	int ubi1[] = new int[3];
	int ubi2[] = new int[3];
	int ubi3[] = new int[3];
	
	String kromiUbi1;
	String kromiUbi2;
	String kromiUbi3;
	int a;
	int b;

	Random corde = new Random();
	Vida vida=new Vida();
	// int[] kromiUbi= {};

	ArrayList<String> kromiUbi = new ArrayList<String>(3);

	public Kromi() {

	}

	public void kromi(String[][] tab) {

		int cont = 0;
		String ubi="";

		do {

			a = 1 + corde.nextInt(13);
			b = 1 + corde.nextInt(15);
			
			ubi=a +"," + b;

			if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")) {

				tab[a][b] = "K";
				tab[a + 1][b] = "K";
				tab[a + 2][b] = "K";
				cont = cont + 1;

				tab = tab;

				if (cont == 1) {
					
					kromiUbi1=a+","+b;
				}

				if (cont == 2) {

					kromiUbi2=a+","+b;
				}
				if (cont == 3) {

					kromiUbi3=a+","+b;
				}

			}
		} while (cont < 3);

		tabla = tab;

	}

	public String[][] tableroKromi() {

		return tabla;
	}

	public String entraLKromi1() {

		return kromiUbi1;
	}

	public String entraLKromi2() {

		return kromiUbi2;
	}

	public String entraLKromi3() {

		return kromiUbi3;
	}
}