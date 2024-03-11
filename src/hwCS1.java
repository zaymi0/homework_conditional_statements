import java.util.Scanner;

public class hwCS1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num < 10){
            System.out.println("Число меньше 10");

        } else if (num == 10){
            System.out.println("Число равно 10");

        } else {
            System.out.println("Число больше 10");
        }
    }
}