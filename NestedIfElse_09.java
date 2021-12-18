package JavaHomeWork;

import java.util.Scanner;

public class NestedIfElse_09 {

	public static void main(String[] args) {
		/*
		 // Kullanicidan yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapilamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
		
		Scanner Scan=new Scanner (System.in);
		
		System.out.println("lutfen yasini gir");
		int yasi=Scan.nextInt();
		
		System.out.println("lutfen kilonu gir");
		int kilo=Scan.nextInt();

		if (yasi>18) {
			
			if (kilo>50) { System.out.println("kan bag�s� yapar");
						
		} 
			else {
				System.out.println("kan bag�s� yapamaz");
			}
			
			
			
		 { System.out.println("kan bag�s� yapamaz");

		if (yasi<18) {
			
		} else {

		}
		
		}
		
		
		
	}

}
}
