package JavaHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoru_V3 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Please enter Integer array's length");
	        int length=scan.nextInt();
	        
	        int array [] = new int [length];
	        
	        for (int i = 0; i < length; i++) {
	            
	        System.out.println("Please enter array "+(i+1)+". elements");
	            array[i]=scan.nextInt();
	        }
	        
	        
	        Arrays.sort(array);
	        
	        System.out.println(array[length-1] + "-" + array[0]+"="+ (array[length-1]-array[0]));
	    
	        
	        
	    }

	}

