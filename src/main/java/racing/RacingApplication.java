package racing;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int totalCarNumber = scanner.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int opportunity = scanner.nextInt();

        Cars cars = Cars.createCars(totalCarNumber);

        for (int i = 0; i < opportunity; i++) {
            cars.race();
            cars.printCarsPosition();
            System.out.println();
        }


    }
}
