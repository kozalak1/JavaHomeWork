package JavaHomeWork;

public class Student {
					// default değerleri
	String name;	 // null 
	int age;		// 0
	String phone; 	// null
	
	Student () { 	// 3-
					
	}
	
	Student (String name, int age, String phone) {	// 5-
		
		this.phone=phone;							// 6-
		this.name=name;								// 7-
				
	}
	
	public static void main(String[] args) {      // 1- program çalışınca ilk bu satır çalışır
	
		Student s1 =  new Student ();			// 2-
		
		Student s2 =  new Student ("John", 25, "014-457962"); // 4-
		
		System.out.print(s2.name + ", " + s2.age + ", " + s2.phone); // 8- //Output: John, 0, 014-457962
		
		// program , s2 objesinin parametresi olan 25 i yazdırmadı; çünkü parametreli Student constructor'unun body si içinde this ile "age" değeri atanmadı/tanımlanmadı;
		// bu nedenle, "age" in değerini 6. satırdan aldı ve default değer olan sıfır ı verdi.  

	}

}
