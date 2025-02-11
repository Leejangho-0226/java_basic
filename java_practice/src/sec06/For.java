package sec06;

public class For {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i); 
		}

		System.out.println("\n- - - - -\n");// 점점 늘어나는 조건 for문				

		for (double d = 123.45; d > 0; d -= 32.1) {
			System.out.println(d);
		}

		for (String s = ""; s.length() < 11; s += "호") {
			System.out.println(s);
		}	
		
		

	}

}
