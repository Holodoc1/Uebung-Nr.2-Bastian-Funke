package h1;

public class H1_main {
	
	public static void main(String[] args) {
		int z = 953;
		if(z > 10) z -= 10;
		System.out.println("Wert von z: " + z);
	}
}
/*
 * Ausgaben:
 *  Wert von z: 943 (z initialisiert mit 953)
 *  Wert von z: 9 (z initialisiert mit 9)
 */
