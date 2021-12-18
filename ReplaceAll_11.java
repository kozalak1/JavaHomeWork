package JavaHomeWork;

public class ReplaceAll_11 {

	public static void main(String[] args) {
		 // soru1	" Java ogrenmek123 Cok guzel@ " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

		String cumle=" Java ogrenmek123 Cok guzel@ ";
		
		String modifiyecumle=cumle.replace("@","");
		
		System.out.println(modifiyecumle);
		
				
		
		modifiyecumle=cumle.replace(" ","x"); // bosluklara x kkoy
		System.out.println(modifiyecumle);
		
		
		modifiyecumle=cumle.replaceAll("\\W","").replaceAll("\\d",""); // kodu de�i�tir
		
		
		System.out.println(modifiyecumle);
		
		
		
		
	}

}
