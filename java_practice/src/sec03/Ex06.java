package sec03;import java.security.spec.MGF1ParameterSpec;

public class Ex06 { // 실수 자료형

	public static void main(String[] args) {
		double a = 0.1, b = 0.2;

		//  ⚠️ 오차가 생김
		double c = a + b;
		System.out.println(c);

		boolean bool = 0.1 + 0.2 == 0.3;
		System.out.println(bool);

		//  float의 최대값과 최소값
		float fMin = -Float.MAX_VALUE;
		float fMax = Float.MAX_VALUE;

		//  double의 최대값과 최소값
		double dMin = -Double.MAX_VALUE;
		double dMax = Double.MAX_VALUE;

		//  최소 절대값
		float fAbsMin = Float.MIN_VALUE;
		double dAbsMin = Double.MIN_VALUE;

		// ⭐ double이 범위도 넓고, 정밀도도 높음 확인
		boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE;
		boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;
		System.out.println(bool1);
		System.out.println(bool2);

		//  최대 정밀도 테스트
		double dblNum = 0.123456789123456789;
		float fltNum = 0.123456789123456789f;
		System.out.println(dblNum);
		System.out.println(fltNum);

	}

}
