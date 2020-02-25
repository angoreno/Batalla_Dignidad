package dignidad;
import java.util.*;
public class Huevo {
	
	/**
	 * @author Isaac Pizarro C
	 * @version 1.0
	 * @fecha 24-02-2020
	 */
	
	private int ubicacionFila;
	private int ubicacionColumna;
	private int puntaje;
	private int cord1;
	private int cord2;
	
	private String cordl;
	
	Scanner leo=new Scanner(System.in);

	public Huevo() {
		// TODO Apéndice de constructor generado automáticamente
	}
	
	//solicita el ingreso de las coordenadas
	public void ingreso_Cord() {
		
		System.out.println("Ingrese coordenada de lanzamiento");
		System.out.println("ingrese letra:");
		setCord(leo.next());
		System.out.println("ingrese numero:");
		cord2=leo.nextInt();		
	}
	
	//conviente la letra en numero para la coordenada
	private void setCord(String letra) {
		
		switch (letra) {
		
		case "a":
			cord1=1;
			break;
		case "b":
			cord1=2;
			break;
		case "c":
			cord1=3;
			break;
		case "d":
			cord1=4;
			break;
		case "e":
			cord1=5;
			break;
		case "f":
			cord1=6;
			break;
		case "g":
			cord1=7;
			break;
		case "h":
			cord1=8;
			break;
		case "i":
			cord1=9;
			break;
		case "j":
			cord1=10;
			break;
		case "k":
			cord1=11;
			break;
		case "l":
			cord1=12;
			break;
		case "m":
			cord1=13;
			break;
		case "n":
			cord1=14;
			break;
		case "o":
			cord1=15;
			break;
			
		}//fin switch
	
	}
	
	//entrega coordenada en una matriz
	public int[] entregaCord() {
		
		int [] cord= {cord1,cord2};
		
		return cord;
	}
	
	//asigna puntaje segun letra de tablero
	private void setPuntaje(String letra) {
		
		int puntos;
		
		switch (letra) {
		case "K":
			puntos=3;
			break;
		case "C":
			puntos=2;
			break;
		case "T":
			puntos=1;
			break;
		}
		
		
	}

}