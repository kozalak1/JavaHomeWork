package JavaHomeWork;

import java.util.Scanner;

public class HomeWork_07 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu alin;
		// eger uc kenar uzunlugu birbirine esit ise ekrana �Eskenar ucgen� yazdirin.
		// Diger durumlarda ekrana �Eskenar degil� yazdirin.

		Scanner scan=new Scanner(System.in);
	
		System.out.println("lutfen kenar1 uzunlugunu girin");
		double kenar1=scan.nextDouble();
		
		System.out.println("lutfen kenar2 uzunlugunu girin");
		double kenar2=scan.nextDouble();
		
		System.out.println("lutfen kenar3 uzunlugunu girin");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {System.out.println("eskenar ucgen");
				
	} 
		else {System.out.println("eskenar degil");
	
	}
	}
}