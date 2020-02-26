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

		Scanner entrada = new Scanner(System.in);

		int frenaBucle = 0;
		int seleccion;

		do {

			System.out.println("*********************************************" + "*************************");
			System.out.println("Bienvenida/o a la batalla contra la cámara" + " secreta de Oscurilandia");
			System.out.println("*********************************************" + "*************************");
			System.out.println("Seleccione Opción");
			System.out.println("1.    Inicia Batalla");
			System.out.println("2.    Salir");
			System.out.println("*********************************************" + "*************************");

			seleccion = entrada.nextInt();

			if (seleccion == 2) {

				System.out.println("*************** Hasta Pronto ****************");
				frenaBucle = 1;

			} else if (seleccion == 1) {

				System.out.println("*************** Empieza la batalla ****************");
				llamaTablero();
				llamaCaguano();
				System.out.println();
				llamaTrupalla();
				System.out.println();
				llamaKromi();
				System.out.println();
				
				//hacer bucle para solicitar a menos que el usuario desee salir
				llamaHuevo();
				System.out.println();

				frenaBucle = 1;

			} else {

				System.out.println("Opción no disponible, vuelve a ingresar opción");
			}

		} while (frenaBucle != 1);

	}

	public static void llamaTablero() { // Un método que llama al tablero inicial

		tableroInicio.muestraTab();

	}

	public static void llamaHuevo() { // Un método que llama al tablero inicial

		iniciaHuevo.ingresoCord(tableroInicio.entregaTabla());

	}

	public static void llamaCaguano() { // Un método que llama al tablero inicial

		iniciaCaguano.Caguano(tableroInicio.entregaTabla());
		//tableroInicio.imprimirTabla(
				iniciaCaguano.tableroCaguano();//);

	}

	public static void llamaTrupalla() { // Un método que llama al tablero inicial

		iniciaTrupalla.Trupalla(tableroInicio.entregaTabla());
		//tableroInicio.imprimirTabla(
		iniciaTrupalla.tableroTrupalla();//);

	}

	public static void llamaKromi() { // Un método que llama al tablero inicial

		iniciaKromi.kromi(tableroInicio.entregaTabla());
		//tableroInicio.imprimirTabla(
				iniciaKromi.tableroKromi();//);

	}

}