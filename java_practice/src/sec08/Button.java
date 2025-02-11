package sec08;

public class Button {

    char print;
    int space;
    String mode;

    Button (char print, int space, String mode) {
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    void place () { // char print, int space, String mode 포멧 출력 메소드
        System.out.printf(
                "표시: %c, 공간: %s, 모드: %s%n",
                print,space, mode
        );
    }
}
