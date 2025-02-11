package sec06;

public class For03 { // 다중 for문

	public static void main(String[] args) {
		//  구구단 예제
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %2d%n", i, j, i * j);
            }
        }

	}

}
