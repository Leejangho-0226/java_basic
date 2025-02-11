package sec03;

public class Ex02 { //형변환 casting

	public static void main(String[] args) {
		byte byteNum;
		int smallIntNum = 123;

		//  명시적(강제) 형변환
		//  - 개발자 : "내가 책임질테니까 그냥 넣으세요."
		byteNum = (byte) smallIntNum;

		System.out.println(byteNum);
		System.out.println(smallIntNum);

		//   강제로 범주 외의 값을 넣을 경우 값 손실
		int intNum = 12345;
		byteNum = (byte) intNum; //  12345 % 128
		System.out.println(byteNum);

	}

}
