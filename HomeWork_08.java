package JavaHomeWork;

import java.time.LocalTime;

public class HomeWork_08 {
	
	public static void main(String[] args) {
		
		/* E�er �ocugunuzun yasi 5 yas�ndan buyukse;
		 
		 ya anas�n�f�na (5-7 aras� dahil) ya da ilkokula (7 den buyukse) gider.
		 
		 e�er, 5 ya��ndan k���k 2 ya��ndan b�y�k ise kre�e gider.
		 
		 
		 */
		
		LocalTime saat=LocalTime.now();
		
		int cocukyasi=3;
		
		
		if (cocukyasi>=5) {
		}
			if (cocukyasi>2 && cocukyasi<7) { System.out.println("ANASINIF");
			}
			else {System.out.println("ilkokul");
			
		} 
			
			 {

			if (cocukyasi>2 && cocukyasi<5) {System.out.println("krese"); 
			}
			else {System.out.println("evde kal�r");
		}
		
		
		
	}
	
				LocalTime saatBitis=LocalTime.now();	 
				System.out.println(saat );
				System.out.println(saatBitis );
	}
	
}
	
