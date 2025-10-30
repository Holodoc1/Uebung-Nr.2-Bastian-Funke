package h3;

public class H3_main {

	public static void main(String[] args) {
		int i = 1000;
		int j = 1000;
		int k = -10;
		if(i > j && !(i > 200) && !(j > 100)) k = 1;
		if(i > j && i > 200 && !(j > 100)) k = 2;
		if(i > j && i > 200 && j > 100) k = 3;
		if(!(i > j) && !(i > 200) && !(j > 100)) k = 4;
		System.out.println("Wert von i: " +i);
		System.out.println("Wert von j: " + j);
		System.out.println("Wert von k: " + k);
	}
}
/* Ausgaben:
Wert von i: 34
Wert von j: 33
Wert von k: 1

Wert von i: 210
Wert von j: 33
Wert von k: 2

Wert von i: 210
Wert von j: 103
Wert von k: 3

Wert von i: 2
Wert von j: 10
Wert von k: 4

Wert von i: 210
Wert von j: 1000
Wert von k: -10
*/