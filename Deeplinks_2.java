package JavaHomeWork;

import java.util.Scanner;

public class Deeplinks_2 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin. 
		 * Bu sayinin tek mi cift mi oldugunu, 
		 * sifirdan buyuk mu kucuk mu oldugunu,
		 * ayrica ve 100�den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 * 100�den kucukse sadece 1�ler basamagini yazdiran 3 method olusturun. */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("g�nl�n�zden gecen bir say� giriniz :");
		
		int sayi=scan.nextInt();
		
		 Scanner scan1=new Scanner(System.in);
	        System.out.println("Lutfen bir sayi giriniz");
	        int sayi1=scan1.nextInt();
	        
	        tekCift(sayi);
	        buyukKucuk(sayi);
	        yuzler(sayi);
	        scan1.close();       
	    }
	    private static void yuzler(int sayi) {
	        if (sayi>100) {
	            int birler= sayi%10;
	            int onlar=(sayi/10)%10;
	            int yuzler=(sayi/100)%10;
	            System.out.println("tum basamaklarin toplami :" + (birler+onlar+yuzler));
	        }else if(sayi<100) {
	            int birler= sayi%10;
	            System.out.println("birler basamagi :"+ birler);
	        }
	        
	    }
	    private static void buyukKucuk(int sayi) {
	        if(sayi<=0) {
	            System.out.println("girilen sayi sifirdan kucuktur");
	        }else {
	            System.out.println("girilen sayi sifirdan buyuktur");
	        }
	        
	    }
	    private static void tekCift(int sayi) {
	        if (sayi%2==0) {
	            System.out.println("girilen sayi cifttir");
	        }else {
	            System.out.println("girilen sayi tektir");
	        }
				
	}

}
