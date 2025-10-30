package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = -60;
		int j = 6;
		int k = 600;
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
