package dignidad;

import java.util.*;

public class Ejecutar {
	
	/**
	 * Llama a metodos de las diferentes clases
	 * Imprime instrucciones
	 * Entrada y salida a juego
	 * Validaci�n de entrada y salida
	 */

	static Tablero tableroInicio = new Tablero();
	static Caguano iniciaCaguano = new Caguano();
	static Trupalla iniciaTrupalla = new Trupalla();
	static Kromi iniciaKromi = new Kromi();
	static Huevo iniciaHuevo = new Huevo();
	static String entCorKromi1;
	static String entCorKromi2;
	static String entCorKromi3;

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		// ejecutar de prueba
		
		ejecutaLanzamiento();


	}

	public static void llamaTablero() { // Un m�todo que llama al tablero inicial

		tableroInicio.muestraTab();

	}

	public static void llamaHuevo() { // Un m�todo que llama al tablero inicial

		iniciaHuevo.ingresoCord(tableroInicio.entregaTabla());

	}

	public static void llamaCaguano() { // Un m�todo que llama al tablero inicial

		iniciaCaguano.Caguano(tableroInicio.entregaTabla());
		iniciaCaguano.tableroCaguano();

	}

	public static void llamaTrupalla() { // Un m�todo que llama al tablero inicial

		iniciaTrupalla.Trupalla(tableroInicio.entregaTabla());
		iniciaTrupalla.tableroTrupalla();

	}

	public static void llamaKromi() { // Un m�todo que llama al tablero inicial

		iniciaKromi.kromi(tableroInicio.entregaTabla());
		iniciaKromi.tableroKromi();
		entCorKromi1=iniciaKromi.entraLKromi1();
		entCorKromi2=iniciaKromi.entraLKromi2();
		entCorKromi3=iniciaKromi.entraLKromi3();
		

	}
	
	public static void ejecutaLanzamiento() {
		
		Scanner entrada = new Scanner(System.in);

		int frenaBucle = 0;
		String seleccion;

		do {

			System.out.println("*********************************************" + "*************************");
			System.out.println("Bienvenida/o a la batalla contra la c�mara" + " secreta de Oscurilandia");
			System.out.println("*********************************************" + "*************************");
			System.out.println("Seleccione Opci�n");
			System.out.println("1.    Inicia Batalla");
			System.out.println("2.    Salir");
			System.out.println("*********************************************" + "*************************");

			seleccion = entrada.nextLine();

			if (seleccion.equals("2")) {

				System.out.println("*************** Hasta Pronto ****************");
				frenaBucle = 1;

			} else if (seleccion.equals("1")) {

				System.out.println("********* Instrucciones*********");
				System.out.println("Debe ingresar la letra y el n�mero de");
				System.out.println("coordenada se�alada en la tabla a la que");
				System.out.println("quiere apuntar el huevo. En primer lugar la letra");
				System.out.println("y posteriormente el n�mero.");
				System.out.println("El juego finaliza una vez que los 18 veh�culos");
				System.out.println("hayan recibido un huevo.");
				System.out.println("Si quiere finalizar anticipademente la");
				System.out.println("partida debe ingresar 0, al hacer esto volver�");
				System.out.println("al men� principal.");
				System.out.println("");
				
				System.out.println("*************** Empieza la batalla ****************");
				llamaTablero();
				llamaCaguano();
				llamaTrupalla();
				llamaKromi();
				
				//hacer bucle para solicitar a menos que el usuario desee salir
				llamaHuevo();
				System.out.println();

				frenaBucle = 1;

			} else {

				System.out.println("Opci�n no disponible, vuelve a ingresar opci�n");
			}

		} while (frenaBucle != 1);

		
	}

}