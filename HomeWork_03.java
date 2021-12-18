package JavaHomeWork;

public class HomeWork_03 {

	public static void main(String[] args) {
	
	String cinsiyet= "kadin"; // k harfi K olmal�yd�
	double yas= 13;
	
		if(cinsiyet.equals("Erkek")) {			

			if(yas<18) {

				System.out.println("Elma");

			  }else {

				System.out.println("Armut");

			 }

}else if(cinsiyet.equals("Kadin")) {	

			if(yas<18) {

				System.out.println("Portakal");

			  }else {

				System.out.println("Erik");

			 }

}else {

			System.out.println("Domates");

}

	}

} // Domates 
