package dignidad;

public class Vida {

	/**
	 * Cuenta puntos y comprueba la eliminación de los vehiculos
	 */

	int vidaKromi1;
	int vidaKromi2 = 3;
	int vidaKromi3 = 3;
	int vidaCaguano;
	int puntajeCarro;

	private String cordKromi1;
	private String cordKromi2;
	private String cordKromi3;

	String cordCatena1;
	String cordCatena2;
	String cordCatena3;

	private String[][] tabla;

	// Kromi micro = new Kromi();

	public Vida() {

	}

	public Vida(String[][] tab) {
		tabla = tab;
	}

	/**
	 * Este metodo es para ver la posicion de la Kromi dentro del tablero y saber si
	 * le dio a las 3 casillas
	 * 
	 * @param cordLanzamiento
	 * @param cordK1
	 * @param vida
	 * @return
	 * 
	 */
	public int vidaKromi1(int[] cordLanzamiento, String cordK1, int vida) {

		int cord1 = cordLanzamiento[0];
		int cord2 = cordLanzamiento[1];

		cordKromi1 = cordK1;

		int val1 = devVal(cordKromi1, cord1, cord2);

		System.out.println(cord1);
		System.out.println(val1);

		val1 = val1 + cord1;

		cordCatena1 = (val1) + "," + cord2;

		int vida1 = vida;
		System.out.println(cordKromi1);
		System.out.println(cord1);
		System.out.println(cordCatena1);

		if (cordKromi1.equals(cordCatena1)) {
			vida1 = vida1 - 1;
			System.out.println("valor de la vida " + vida1);
		}

		return vida1;
	}

	public int vidaKromi2(int[] cordLanzamiento, String cordK2, int vida) {

		int cord1 = cordLanzamiento[0];
		int cord2 = cordLanzamiento[1];

		cordKromi1 = cordK2;

		int val1 = devVal(cordKromi1, cord1, cord2);

		cordCatena1 = (cord1 + val1) + "," + cord2;

		int vida1 = vida;

		if (cordKromi1.equals(cordCatena1)) {
			vida1 = vida1 - 1;
			System.out.println("valor de la vida " + vida1);
		}

		return vida1;
	}

	public int vidaKromi3(int[] cordLanzamiento, String cordK3, int vida) {

		int cord1 = cordLanzamiento[0];
		int cord2 = cordLanzamiento[1];

		cordKromi1 = cordK3;
		System.out.println(cordKromi1);

		int val1 = devVal(cordKromi1, cord1, cord2);

		cordCatena1 = (cord1 + val1) + "," + cord2;

		int vida1 = vida;

		if (cordKromi1.equals(cordCatena1)) {
			vida1 = vida1 - 1;
			System.out.println("valor de la vida " + vida1);
		}

		return vida1;
	}

	/**
	 * Este metodo evalua la posicion del lanzamiento dentro de la micro, de esta
	 * forma busca la coordenada inicial dando la ubicacion exacta de la Kromi
	 * dentro de la tabla
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public int devVal(String a, int b, int c) {
		int pos = 0;

		String cordCat3 = b + "," + c;// original
		int b1 = b - 2;
		String cordCat1 = b1 + "," + c;
		int b2 = b - 1;
		String cordCat2 = b2 + "," + c;
		int b3 = b + 1;
		String cordCat4 = b3 + "," + c;
		int b4 = b + 2;
		String cordCat5 = b4 + "," + c;

		System.out.println("valor de a " + a);
		System.out.println("valor de cor 1: " + cordCat1);
		System.out.println("valor de cor 2: " + cordCat2);
		System.out.println("valor de cor 3: " + cordCat3);
		System.out.println("valor de cor 4: " + cordCat4);
		System.out.println("valor de cor 5: " + cordCat5);

		if (cordCat1.equals(a)==true){
			pos = -2;
		} else {
			pos = 9;
		}
		if (cordCat2.equals(a)==true) {
			pos = -1;
		} else {
			pos = 9;
		}
		if (cordCat3.equals(a)==true) {
			pos = 0;
		} else {
			pos = 9;
		}
		if (cordCat4.equals(a)==true) {
			pos = +1;
		} else {
			pos = 9;
		}
		if (cordCat5.equals(a)==true) {
			pos = +2;
		} else {
			pos = 9;
		}

		System.out.println("este es el factor " + pos);
		return pos;
	}

}
