package dignidad;

import java.util.*;

public class Huevo {
	
	/**
	 * Entrega tablero con coordenadas
	 * Solicita coordenadas para lanzamiento de huevos
	 * Entrega puntaje 
	 * imprime "H" en coordenadas de huevo
	 */

	private int ubicacionFila;
	private int ubicacionColumna;
	private int puntaje;
	private int puntajeCarro;
	private int cord1;
	private int cord2;
	private int vidaK1 = 3;
	private int vidaK2 = 3;
	private int vidaK3 = 3;

	private String letracord;
	private String letraTab;
	private String cordl;
	private String[][] tabla;

	private String corKromi1;
	private String corKromi2;
	private String corKromi3;

	ArrayList litaPuntaje = new ArrayList();
	Scanner leo = new Scanner(System.in);
	Ejecutar ejecuta = new Ejecutar();
	Vida vida = new Vida(tabla);

	public Huevo() {
		// TODO Apéndice de constructor generado automáticamente
	}

	// solicita el ingreso de las coordenadas
	public void ingresoCord(String[][] tab) {

		tabla = tab;
		impTab(tabla);

		System.out.println("Ingrese coordenada de lanzamiento");
		System.out.println("ingrese letra:");
		letracord = leo.next();
		if (letracord.equals("0")) {

			System.out.println("");
			System.out.println("Partida finalizada anticipadamente");
			System.out.println("");
			ejecuta.ejecutaLanzamiento();

		} else {
			setCord(letracord);
			System.out.println("ingrese numero:");
			cord2 = leo.nextInt();

			lanzamientoHuevo();
			ingresoCord(tabla);
		}
		// desea otro lanzamiento?
	}

	// conviente la letra en numero para la coordenada
	private void setCord(String letra) {

		switch (letra) {

		case "a":
			cord1 = 1;
			break;
		case "b":
			cord1 = 2;
			break;
		case "c":
			cord1 = 3;
			break;
		case "d":
			cord1 = 4;
			break;
		case "e":
			cord1 = 5;
			break;
		case "f":
			cord1 = 6;
			break;
		case "g":
			cord1 = 7;
			break;
		case "h":
			cord1 = 8;
			break;
		case "i":
			cord1 = 9;
			break;
		case "j":
			cord1 = 10;
			break;
		case "k":
			cord1 = 11;
			break;
		case "l":
			cord1 = 12;
			break;
		case "m":
			cord1 = 13;
			break;
		case "n":
			cord1 = 14;
			break;
		case "o":
			cord1 = 15;
			break;

		}// fin switch

	}

	// entrega coordenada en una matriz
	private int[] entregaCord() {

		// System.out.println(cord1);
		// System.out.println(cord2);

		int[] cord = { cord1, cord2 };

		return cord;
	}

	// asigna puntaje segun letra de tablero
	private void letraLanzamineto(String letra) {

		Vida vida = new Vida(tabla);

		int puntos = 0;
		int puntoCarro = 0;

		switch (letra) {
		case "K":
			System.out.println("Le diste a una Kromi");
			puntos = 3;
			casoK1();
			System.out.println("hola1");
			casoK2();
			System.out.println("hola2");
			casoK2();
			System.out.println("hola3");

			break;
		case "C":
			System.out.println("Le diste a un Caguano");
			puntos = 2;
			break;
		case "T":
			System.out.println("Le diste a una Trupalla");
			puntos = 1;
			break;
		case "~":
			System.out.println("Le diste a nada, mejora tu puntería");
			puntos = 0;
			break;
		case "H":
			System.out.println("Aburrido..., no lances en el mismo lugar");
			puntos = 0;
			break;
		}
		
		
		puntaje = puntos+puntajeCarro;
	}

	private void lanzamientoHuevo() {

		letraTab = tabla[cord1][cord2];
		
		letraLanzamineto(letraTab);
		
		tabla[cord1][cord2] = "H";

	}

	private void impTab(String[][] tab) {

		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {
				System.out.print("[" + tab[i][j] + "]");
			}
			System.out.println();
		}

	}

	public String daCordKromi() {
		return corKromi1;
	}

	public void casoK1() {
	corKromi1 = ejecuta.entCorKromi1;

	int vidTemp1 = vida.vidaKromi1(entregaCord(), corKromi1, vidaK1);
	vidaK1 = vidTemp1;
	System.out.println(vidaK1);
	if (vidaK1 == 0) {
		System.out.println("pase.....");
		System.out.println("Excelente te piteaste una Kromi");
		puntajeCarro = puntajeCarro + 10;
	}
	}
	public void casoK2() {
		corKromi2 = ejecuta.entCorKromi2;
		
		int vidTemp2 = vida.vidaKromi2(entregaCord(), corKromi1, vidaK2);
		vidaK2 = vidTemp2;
		System.out.println(vidaK2);
		if (vidaK2 == 0) {
			System.out.println("pase.....");
			System.out.println("Excelente te piteaste una Kromi");
			puntajeCarro = puntajeCarro + 10;
		}
	}
	
	public void casoK3() {
		corKromi3 = ejecuta.entCorKromi3;
		
		int vidTemp3 = vida.vidaKromi3(entregaCord(), corKromi1, vidaK3);
		vidaK3 = vidTemp3;
		System.out.println(vidaK3);
		if (vidaK3 == 0) {
			System.out.println("pase.....");
			System.out.println("Excelente te piteaste una Kromi");
			puntajeCarro = puntajeCarro + 10;
		}
	}
}
