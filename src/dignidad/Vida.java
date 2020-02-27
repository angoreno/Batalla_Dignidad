package dignidad;

public class Vida {
	
	int vidaKromi1=3;
	int vidaKromi2=3;
	int vidaKromi3=3;
	
	int vidaCaguano;
	
	int[] listaKromi1; 
	int[] listaKromi2;
	int[] listaKromi3;
	
	private String [][] tabla;
	
	
	Kromi micro =new Kromi();
	

	public Vida() {
	
	}
	
	public void recTabla(String[][] tab) {
		tabla=tab;
	}
	
	
	public void vidaKromi(int[]cordLanzamiento) {// cordLanzamiento {num1,num2}
		
		//separo las coordenadas para manejarlas de a una
		int cord1=cordLanzamiento[0];
		int cord2=cordLanzamiento[1];
		
		listaKromi1=micro.entraLKromi1();
		listaKromi2=micro.entraLKromi1();
		listaKromi3=micro.entraLKromi1();
		
		int a1=listaKromi1[1];
		int b1=listaKromi1[2];
		
		
		

		if (tabla[a1][b1].equals(tabla[cord1][cord2])) {
			if (tabla[a1+1][b1].equals(tabla[cord1][cord2])) {
				if (tabla[a1+1][b1].equals(tabla[cord1][cord2])) {
					vidaKromi1=vidaKromi1-1;
					System.out.println(vidaKromi1);
				}
				
			}
			
		}
		
		
	}


}
