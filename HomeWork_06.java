package JavaHomeWork;

import java.util.Scanner;

public class HomeWork_06 {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup 
		 // olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir karakter giriniz");
		char karakter=scan.next().charAt(0);
				
		if ((karakter>='A'&& karakter<='Z') || (karakter>='a'&& karakter<='z')) {
			System.out.println("Girdiginiz :" +     karakter + " HARF");
		}
		
		else {
			System.out.println("Girdiginiz :"+karakter+ " HARF DEGIL");
		}
			
		
		
		
	}

}
