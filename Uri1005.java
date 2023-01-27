package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double n1, n2;
		double med;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		med = ((n1 * 3.5 + n2 * 7.5)) / 11; 
				
		System.out.printf("MEDIA = %.5f%n", med);
		
		
		sc.close();

	}

}
