package sec05;

public class Switch02 { // 문자열 사용

	public static void main(String[] args) {
		String direction = "east";
        String dirKor;

        //  break 제거하고 실행해 볼 것
        switch (direction) {
            case "north":
                dirKor = "북";
                break;
            case "south":
                dirKor = "남";
                break;
            case "east":
                dirKor = "동";
                break;
            case "west":
                dirKor = "서";
                break;
            default:
                dirKor = null;
        }

        System.out.println(
                dirKor != null ? dirKor : "무효"
        );

	}

}
