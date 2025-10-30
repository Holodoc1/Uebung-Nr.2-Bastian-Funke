package h1;

public class H1_main {
	
	public static void main(String[] args) {
		int z = 9;
		System.out.println("Wert von z vor Abfrage: " + z);
		if(z > 10) z -= 10;
		System.out.println("Wert von z nach Abfrage: " + z);
	}
}
/* Ausgaben:
Wert von z vor Abfrage: 953
Wert von z nach Abfrage: 943

Wert von z vor Abfrage: 9
Wert von z nach Abfrage: 9
 */
