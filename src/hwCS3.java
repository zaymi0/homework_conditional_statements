import java.util.Scanner;

public class hwCS3 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Введите первое число ");
        int num = scanner.nextInt();
        System.out.println("Введите второе число ");
        int num1 = scanner.nextInt();
        System.out.println("Введите третье число ");
        int num2 = scanner.nextInt();

        if (num == num1 && num1 == num2 && num == num2) {
            System.out.println(" треугольник равносторонний ");

        } else if (num == num1 || num1 == num2 || num == num2) {
            System.out.println(" треугольник равнобедренный");

        } else {
            System.out.println(" треугольник разносторонний");
        }
    }
}
