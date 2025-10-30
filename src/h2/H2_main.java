package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 6;
		int j = 10;
		int k = 6;
		int min = i;
		int max = i;
		if(j < min) min = j;
		else if(j > max) max = j;
		if(k < min) min = k;
		else if(k > max) max = k;
		System.out.println("Wert von i: " + i);
		System.out.println("Wert von j: " + j);
		System.out.println("Wert von k: " + k);
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
}
/* Ausgaben:
Wert von i: -60
Wert von j: 600
Wert von k: 60
Minimum: -60
Maximum: 600

Wert von i: -60
Wert von j: 600
Wert von k: 6000
Minimum: -60
Maximum: 6000

Wert von i: 60
Wert von j: 6
Wert von k: 6000
Minimum: 6
Maximum: 6000

Wert von i: 60
Wert von j: 6
Wert von k: 55
Minimum: 6
Maximum: 60

Wert von i: 60
Wert von j: 6
Wert von k: 5
Minimum: 5
Maximum: 60

Wert von i: 60
Wert von j: 600
Wert von k: 5
Minimum: 5
Maximum: 600

Wert von i: 6
Wert von j: 6
Wert von k: 6
Minimum: 6
Maximum: 6

Wert von i: 6
Wert von j: 6
Wert von k: 10
Minimum: 6
Maximum: 10

Wert von i: 6
Wert von j: 10
Wert von k: 10
Minimum: 6
Maximum: 10
 */
