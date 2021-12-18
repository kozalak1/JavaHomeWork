package JavaHomeWork;

import java.util.Arrays;

public class MultiDimensionalArrays_ {

	public static void main(String[] args) {
		
		//*****************MultiDimensionalArray - MAD oluşturmak için 1. yöntem*************
		
		int plakaNo[] []= { {3,5}, {8,14}, {78,44,21,81} }; // 2 katmanlı MultiDimensionalArray oluşturduk//
		
		System.out.println(plakaNo[2][3]); // 81
		
		System.out.println(Arrays.toString(plakaNo)); // [[I@1c4af82c, [I@379619aa, [I@cac736f]// array lerin referansları
		
		System.out.println(Arrays.deepToString(plakaNo)); // [[3, 5], [8, 14], [78, 44, 21, 81]]
		
		
		////*****************MultiDimensionalArray - MAD oluşturmak için 2. yöntem*************
		
		int sepet[][]=new int [2][2]; // sepet adında MultiDimensionalArray oluşturduk
		
		sepet[0][0]=11;
		sepet[0][1]=22;
		
		sepet[1][0]=5;
		sepet[1][1]=47;
		
		System.out.println(sepet); // [[I@5e265ba4
		
		System.out.println(Arrays.toString(sepet)); // [[I@156643d4, [I@123a439b] // array lerin referansları
				
		System.out.println(Arrays.deepToString(sepet)); // [[11, 22], [5, 47]]

		
	}
}
