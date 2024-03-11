import java.util.Scanner;

public class hwCS2 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Введите первое число ");
        int num = scanner.nextInt();
        System.out.println("Введите второе число ");
        int num1 = scanner.nextInt();

        if (num > num1) {
            System.out.println("Первое число больше второго");

        } else if (num < num1) {
            System.out.println("Первое число меньше второго");

        } else {
            System.out.println("Числа равны");
        }
    }
}
