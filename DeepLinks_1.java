package JavaHomeWork;

import java.util.Scanner;

public class DeepLinks_1 {

	public static void main(String[] args) {
		/*
 		Email kontrolu yapan bir program yazin.Kullanicinin girdigi email
	-@ isareti icermiyorsa gecersiz email yazdirin			-
	-@gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin			-
	-@gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz" yazdirin
 */

		Scanner scan=new Scanner( System.in);
		System.out.println("Lutfen mail adresi giriniz");
		String email=scan.next();
		
		
		karakter(email);
			
	
		
	}
	private static void karakter(String email) {
		
		if (!email.contains("@")) {
		System.out.println(" gecersiz email yazdirin");
		
		} else if(!email.contains("@gmail.com")) {
         System.out.println("Lutfen gmail adresinizi girin");
		}else if(!email.endsWith("@gmail.com")){
		System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
		
		}else {
			System.out.println("kayd�n�z al�nd�");
		}
		
	    
		
		
		
		
		
	}

}
