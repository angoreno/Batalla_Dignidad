package dignidad;
import java.util.*;
public class Caguano extends Carro {
	private int alcanceTiro = 10;
	private String colorConfeti = "rojo";
	Random corde = new Random();
	public Caguano (String [][] tab) {
		//caguanos
		int a;
		int b;
		int cont=0;
		a = 1 + corde.nextInt(15); 
		b = 1 + corde.nextInt(14); 
		do {
			if (tab[a][b].equals("~") && tab[a][b + 1].equals("~")) {
				tab[a][b] = "C";
				cont=cont+1;
			}
		}while (cont <= 5 );
	}
//retorno	
}