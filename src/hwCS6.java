import java.util.Scanner;

public class hwCS6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        boolean sorted = false;
        int arraySorting;
        int sum;

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите число №%d  ", i + 1);
            int num = scanner.nextInt();
            array[i] = num;
        }

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    arraySorting = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = arraySorting;
                    sorted = false;
                }
            }
        }
        sum = array[0] + array[array.length - 1];
        System.out.println("Сумма " + sum);
    }
}
