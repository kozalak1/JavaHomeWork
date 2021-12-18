package JavaHomeWork;

import java.util.Arrays;

public class MultiDimensionalArrays_2 {

	public static void main(String[] args) {
		
		int plakaNo[] []= { {3,5}, {8,14}, {78,44,21,81} };
		
		
		//***** Multi Dimensional Array’in tum elemanlari nasil yazdirilir ? *****
		
		
		
		//*********** nested for loop ile ******************
		
		for (int i = 0; i < plakaNo.length; i++) {
			
			for (int j = 0; j < plakaNo[i].length; j++) {
				
				System.out.print(plakaNo[i][j]+" "); // 3 5 8 14 78 44 21 81 
			}
						
		}
		// ****************************************------------******************
		
		System.out.println();
		
		
		// ****************** Arrays class dan method ile *************
		
		System.out.println(Arrays.deepToString(plakaNo)); // [[3, 5], [8, 14], [78, 44, 21, 81]]
		

	}

}
