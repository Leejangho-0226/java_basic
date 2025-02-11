package sec04;

public class If03 { // 가독성이 좋지 않음

	public static void main(String[] args) {
		int score = 100;

        //  💡 else if : 첫 if문이 false일 때 다른 조건을 연속 사용
        //  else만 사용하는 것은 맨 마지막에
        if (score > 90) {
            System.out.println('A');
        } else if (score > 80) {
            System.out.println('B');
        } else if (score > 70) {
            System.out.println('C');
        } else if (score > 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
	}

}
