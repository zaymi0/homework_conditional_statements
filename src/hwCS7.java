import java.util.Scanner;

public class hwCS7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int userNumber = scanner.nextInt();
        String answer = userNumber % 2 == 0 ? "Четное" : "Нечетное";
        System.out.printf(answer);
    }
}
