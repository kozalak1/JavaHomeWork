package JavaHomeWork;

import java.util.Scanner;

public class HomeWork_04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an integer");

		int a = scan.nextInt();

				if(a%2==0) {

					if(a%3==0) {

						System.out.println("Woooow!");

					}else {

						System.out.println("Hmmmm!");

					}

				}else{

					if(a%3==0) {

						System.out.println("Normal!");

					}else {

						System.out.println("Yazik!");

					}

		       }

	}

}
