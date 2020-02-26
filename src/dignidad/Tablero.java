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
	String[][] tab;

	public Tablero() {

	}

	public void muestraTab() { // con esto se llama el metodo tablero

		int cord1 = 0;// colum
		int cord2 = 0;// fila
		int info = 0;
		String[][] tab = { { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" },
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

		this.tab = tab;

		//imprimirTabla(tab);


	}

	public String[][] entregaTabla() {

		String[][] tabla = {};

		tabla = tab;

		return tabla;

	}

	public void imprimirTabla(String[][] tabla2) {

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab.length; j++) {
				System.out.print("[" + tab[i][j] + "]");
			}
			System.out.println(); // linea
		}
	}
	
	
}