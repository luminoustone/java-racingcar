package racing;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputCarCount() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int inputOpportunity() {
        System.out.println("시도할 회수는 몇 회 인가요?");
        int opportunity = scanner.nextInt();
        System.out.println();
        return opportunity;
    }
}
