package dignidad;
import java.util.*;
public class Ejecutar {
	public Ejecutar() {
	}
	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		//ejecutar de prueba
		
	
		Scanner entrada = new Scanner(System.in);
		
		int frenaBucle = 0;
		int seleccion; 
		do {
			
			System.out.println("*********************************************"
					+ "*************************");
			System.out.println("Bienvenida/o a la batalla contra la c�mara"
					+ " secreta de Oscurilandia");
			System.out.println("*********************************************"
							+ "*************************");
			System.out.println("Seleccione Opci�n");
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
				
				System.out.println("Opci�n no disponible, vuelve a ingresar opci�n");
			}
			
			
		}while (frenaBucle != 1);
		
	
	
	}
	
	public static void llamaTablero() { //Un m�todo que llama al tablero inicial
		
		Tablero tableroInicio = new Tablero(); 
		
		tableroInicio.muestraTab();
	
		
		}
	
	public static void llamaHuevo() { //Un m�todo que llama al tablero inicial
		
		Huevo iniciaHuevos = new Huevo(); 
		
		iniciaHuevos.ingreso_Cord();
	
		
		}
	
	
	
	}