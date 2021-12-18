package JavaHomeWork;

import java.util.Scanner;

public class Deeplinks_3 {

	public static void main(String[] args) {
		//* Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
        //  numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
        //    sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
        //  duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

		
		 Scanner scan=new Scanner( System.in);
	        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
	        String isim=scan.next();
	        String soyisim=scan.next();
	        
	        System.out.println("Lutfen kredi kartı numaranızı giriniz");
	        
	        String kkNo=scan.next();
	        
	        adSoyad(isim,soyisim);
	        
	        kk(kkNo);
	        
	        System.out.println(kk(kkNo));
	        System.out.println(adSoyad(isim,soyisim));
	        
	        scan.close();
	    }
	    private static String kk(String kkNo) {
	        
	    kkNo=kkNo.substring(0, 4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+kkNo.substring(12,16);
	        
	        
	        return kkNo;
	            
	        
	    }
	    private static String adSoyad(String isim, String soyisim) {
	        
	        isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
	            
	        soyisim=soyisim.substring(0, 1).toUpperCase()+soyisim.substring(1).toLowerCase();
	        
	        
	        
	        return isim+" "+soyisim;
		
		
		
		
	}

}
