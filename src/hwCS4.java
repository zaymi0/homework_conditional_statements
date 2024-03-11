import java.util.Scanner;

public class hwCS4 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        int negativeNumbers = 0;
        int positiveNumbers = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("Введите число №%d  ", i + 1);
            int num = scanner.nextInt();
            if (num > 0) {
                positiveNumbers++;
            } else if (num < 0) {
                negativeNumbers++;
            }
        }
        System.out.printf("количество отрицательных: %d\n",negativeNumbers);
        System.out.printf("количество положительных: %d",positiveNumbers);
    }
}
