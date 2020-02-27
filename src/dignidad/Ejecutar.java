package dignidad;

import java.util.*;

public class Ejecutar {

	static Tablero tableroInicio = new Tablero();
	static Caguano iniciaCaguano = new Caguano();
	static Trupalla iniciaTrupalla = new Trupalla();
	static Kromi iniciaKromi = new Kromi();
	static Huevo iniciaHuevo = new Huevo();

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		// ejecutar de prueba
		
		ejecutaLanzamiento();


	}

	public static void llamaTablero() { // Un método que llama al tablero inicial

		tableroInicio.muestraTab();

	}

	public static void llamaHuevo() { // Un método que llama al tablero inicial

		iniciaHuevo.ingresoCord(tableroInicio.entregaTabla());

	}

	public static void llamaCaguano() { // Un método que llama al tablero inicial

		iniciaCaguano.Caguano(tableroInicio.entregaTabla());
		iniciaCaguano.tableroCaguano();

	}

	public static void llamaTrupalla() { // Un método que llama al tablero inicial

		iniciaTrupalla.Trupalla(tableroInicio.entregaTabla());
		iniciaTrupalla.tableroTrupalla();

	}

	public static void llamaKromi() { // Un método que llama al tablero inicial

		iniciaKromi.kromi(tableroInicio.entregaTabla());
		iniciaKromi.tableroKromi();

	}
	
	public static void ejecutaLanzamiento() {
		
		Scanner entrada = new Scanner(System.in);

		int frenaBucle = 0;
		String seleccion;

		do {

			System.out.println("*********************************************" + "*************************");
			System.out.println("Bienvenida/o a la batalla contra la cámara" + " secreta de Oscurilandia");
			System.out.println("*********************************************" + "*************************");
			System.out.println("Seleccione Opción");
			System.out.println("1.    Inicia Batalla");
			System.out.println("2.    Salir");
			System.out.println("*********************************************" + "*************************");

			seleccion = entrada.nextLine();

			if (seleccion.equals("2")) {

				System.out.println("*************** Hasta Pronto ****************");
				frenaBucle = 1;

			} else if (seleccion.equals("1")) {

				System.out.println("********* Instrucciones*********");
				System.out.println("Debe ingresar la letra y el número de");
				System.out.println("coordenada señalada en la tabla a la que");
				System.out.println("quiere apuntar el huevo. En primer lugar la letra");
				System.out.println("y posteriormente el número.");
				System.out.println("El juego finaliza una vez que los 18 vehículos");
				System.out.println("hayan recibido un huevo.");
				System.out.println("Si quiere finalizar anticipademente la");
				System.out.println("partida debe ingresar 0, al hacer esto volverá");
				System.out.println("al menú principal.");
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

				System.out.println("Opción no disponible, vuelve a ingresar opción");
			}

		} while (frenaBucle != 1);

		
	}

}