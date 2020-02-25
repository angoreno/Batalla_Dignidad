package dignidad;

import java.util.*;

public class Tablero {
	// Arraylist????
	// ArrayList<String> huevos = new ArrayList<String>();// las jugadas de huevo o
	// cada oportunidad?? no sabemos la
	// cantidad
	// arreglo es para las ubicaciones de los vehiculos wque son =18
	// arreglo?????
	// String [] ubicacionCarros;//ubicacion de cada carro formato (numero,numero)
	int cord1 = 0;
	int cord2 = 0;
	int info = 0;

	private void muestraTab() { // con esto se llama el metodo tablero
			int cord1 = 0;//colum
			int cord2 = 0;// fila
			int info = 0;
			String[][] tab =     { { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10","11","12","13","14","15"},
								   { "A", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "B", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "C", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "D", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "E", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "F", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "G", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "H", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "I", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "J", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "K", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "L", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "M", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "N", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" },
								   { "O", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~", "~" } };
			for (int i = 0; i < tab.length; i++) {
				for (int j = 0; j < tab.length; j++) {
					System.out.print("[" + tab[i][j] + "]");
				}
				System.out.println();		
			}
			////// PKC 
			Random corde = new Random();
			Caguano cag =new Caguano(tab);
			
			private void randonPKC()  { /// con esto se llama el metodo ubicacion random  PKC
				int a;
				int b;
				int cont;
				private void kromis () {
					//kromis
					a = 1 + corde.nextInt(13); 
					b = 1 + corde.nextInt(15); 
					do {
						if (tab[a][b].equals("~") && tab[a + 1][b].equals("~") && tab[a + 2][b].equals("~")) {
							tab[a][b] = "K";
							cont=cont+1;
						}
					}while (cont <= 3 );
				}
				private void caguano () {
					//caguaos
					a = 1 + corde.nextInt(15); 
					b = 1 + corde.nextInt(14); 
					do {
						if (tab[a][b].equals("~") && tab[a][b + 1].equals("~")) {
							tab[a][b] = "C";
							cont=cont+1;
						}
					}while (cont <= 5 );
				}
				private void Trapulla () {
					//trapulla
					a = 1 + corde.nextInt(15); 
					b = 1 + corde.nextInt(14); 
					do {
						if (tab[a][b].equals("~")) {
							tab[a][b] = "T";
							cont=cont+1;
						}
					}while (cont <= 10);
				}	
			}
		}
}