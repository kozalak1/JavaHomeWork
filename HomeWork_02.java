package JavaHomeWork;


public class HomeWork_02 {

	public static void main(String[] args) {
				
		int vize1=100;
		int vize2=120;
				
		int ortalama = (vize1 + vize2) / 2; 

		boolean bl = vize1<0 || vize2<0 || vize1>100 || vize2>100;

		if(bl) {

			System.out.println("Gecerli not giriniz");

	    }else if (ortalama > 70) {

			System.out.println("Woooow!");

		}else if (ortalama > 45) {

			System.out.println("Hmmmm!");

		}else {

			System.out.println("Offff!");
		

	}

}

	
} // Gecerli not giriniz