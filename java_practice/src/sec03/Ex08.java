package sec03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		//  IDE가 최상단에 import java.util.Scanner 자동 작성
		
        Scanner sc = new Scanner(System.in);
        
        
		String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        
        

	}

}
