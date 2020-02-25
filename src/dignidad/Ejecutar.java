package dignidad;
import java.util.*;
public class Ejecutar {
	public Ejecutar() {
	}
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//ejecutar de prueba
		
	
		Scanner entrada = new Scanner(System.in);
		
		int frenaBucle = 0;
		int seleccion; 
		do {
			
			System.out.println("*********************************************"
					+ "*************************");
			System.out.println("Bienvenida/o a la batalla contra la cámara"
					+ " secreta de Oscurilandia");
			System.out.println("*********************************************"
							+ "*************************");
			System.out.println("Seleccione Opción");
			System.out.println("1.    Inicia Batalla");
			System.out.println("2.    Salir");
			System.out.println("*********************************************"
					+ "*************************");
		
		
			seleccion = entrada.nextInt(); 
			
	 
			
			
			if (seleccion == 2) {
				
				System.out.println("*************** Hasta Pronto ****************");
				frenaBucle = 1;
				
			}else if (seleccion == 1) {
				
				System.out.println("*************** Empieza la batalla ****************");
				llamaTablero();
				frenaBucle = 1; 
				
				
			}else {
				
				System.out.println("Opción no disponible, vuelve a ingresar opción");
			}
			
			
		}while (frenaBucle != 1);
		
	
	
	}
	
	public static void llamaTablero() { //Un método que llama al tablero inicial
		
		Tablero tableroInicio = new Tablero(); 
		
		tableroInicio.muestraTab();
	
		
		}
	
	public static void llamaHuevo() { //Un método que llama al tablero inicial
		
		Huevo iniciaHuevos = new Huevo(); 
		
		iniciaHuevos.ingreso_Cord();
	
		
		}
	
	
	
	}