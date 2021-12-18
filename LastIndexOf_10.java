package JavaHomeWork;

public class LastIndexOf_10 {

	public static void main(String[] args) {
		
		/*	Hakki hakkidan hakkini istemis
		hakki hakkinin hakkini vermemis
		hakki hakkinin hakkini vermeyince
		Hakki da hakkinin hakkindan gelmis */

		
		String hakkı="Hakki hakkidan hakkini istemis\r\n"
				+ "		hakki hakkinin hakkini vermemis\r\n"
				+ "		hakki hakkinin hakkini vermeyince\r\n"
				+ "		Hakki da hakkinin hakkindan gelmis";
		
	
		
		System.out.println(hakkı.indexOf("s")); // 24
		
		System.out.println(hakkı.lastIndexOf("s")); // 139
		
		System.out.println(hakkı.length()); // 140 index de�il 1 den ba�lay�p say�yor
		
		System.out.println(hakkı.contains("ali")); // FALSE
		
		System.out.println(hakkı.contains("hakki")); // true
		
		System.out.println(hakkı.replaceAll("dan", "can")); 
		
		System.out.println(hakkı.substring(6, 140)); // index kar��l��� olan say�lar dahil
		
		System.out.println(hakkı.toUpperCase());
		
		
	}

}
