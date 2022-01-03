package JavaHomeWork;

import java.util.Scanner;

public class GuessTheFilm {
	
	static String choosenFilm="";
	
	/*
	*****************************Filmi Tahmin Et Oyunu**************************************
	* 1. Bir tane film isim listesi olusturun
	* 2. Kullanicadan liste uzunlugunda bir sayi isteyip, o siradaki filmi cagirin..
	* 3. filmin ismindeki harfleri "-" olacak sekilde ceviririp kullaniciya gösterin.
	* 4. Kullanicidan bir harf tahmin etmesini isteyin
	* 5. Bu harfin isimde olup olmadigini kontrol edin.
	* 6. Girilen harf dogruysa ismin tamaminda bu harfi gösterin.
	* 7. Toplam kac yanlis harf tahmin edildigini gösterin ve limit asildiysa kaybettin yazdirin.
	* 8. Eger hepsi dogru tahmin edildiyse kazandin yazdirin.

	Orjinal Task

	Step by step
	Don't rush into building the entire game at once, start small, for example:
	Write some code that will simply read the movie list and display the whole list.
	Then add to your code to randomly pick one movie and display that title only.
	Then convert its letters to underscores (_) and display that instead, and so on.
	Once you've got that part done start reading the user's input and search for it in the title.
	Work on revealing the correct letters and displaying them.
	Add the logic to keep track of wrong letters so they don't lose points for guessing the same letter twice.
	After that, you can keep track of how many wrong guesses and end the game if they lose.
	Finally, detect when they have guessed all the letters and let them know they've won!
	You can also start by hard coding a single movie title in the code instead of randomly picking one from the file, then add the file reading functionality at the end.*/
	
	
	public static void main(String[] args) {
		
		String filmList[]= {"Inception ", "Interstellar", "Parasite ", "The Departed", "Joker","For Sama","A Separation","1917","12 Years a Slave"};
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 0-9 dahil bir sayı giriniz");
		
		int sıraNo=scan.nextInt() ;
				
		String choosenFilm = filmList[sıraNo];
		
		System.out.println(choosenFilm.replaceAll("\\S","_"));
		
		System.out.println("Bir harf tahmin edin!");
		
		Scanner scan=new Scanner(System.in);
		
				
}
	
}