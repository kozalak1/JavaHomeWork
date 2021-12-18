package JavaHomeWork;

import java.util.Arrays;

public class Arrays_ {

	public static void main(String[] args) {
		
		//************************array oluşturmanın 1. yolu ***********************
		int sepet []=new int[3];
		sepet[0]=9;
		sepet[1]=10;
		sepet[2]=11;
		
		System.out.println(sepet); // [I@6504e3b2 // array in referansı
		
		//************************array oluşturmanın 2. yolu ***********************		
		
		int kasa[]= {12,13,14,18,21,45};
		
		System.out.println(kasa); // [I@379619aa // array in referansı
		
				
		// Array leri yazdırmak için 2 yöntem var:
		
		//******************for loop ile ************************
		
		for (int i = 0; i < kasa.length; i++) {
			System.out.print(kasa[i]+","); // 12,13,14,18,21,45,
		}
		
		//*******************Arrays Classından toString ile****************
		
		System.out.println(Arrays.toString(kasa)); // [12, 13, 14, 18, 21, 45]
		
		//*******************Array in SADECE 1 elemanını yazdırmak için****************
		
		System.out.println(kasa[2]); // 14
		
		//****************sort ve binarySearch**************
		
		Arrays.sort(kasa);
		System.out.println(Arrays.toString(kasa)); // [12, 13, 14, 18, 21, 45]
		System.out.println(Arrays.binarySearch(kasa,12)); // 0
		System.out.println(Arrays.binarySearch(kasa,25)); // -6 // sıra numarasına göre olması gereken yeri negatif değerde verir
		
		//********************equals()***********************
		
		System.out.println(Arrays.equals(kasa, sepet)); // false
		
		// ------------- length --------------------
		
		System.out.println(sepet.length); // 3
		
		System.out.println(kasa.length); // 6
	}

	
}
