import java.util.Scanner;

public class hwCS8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milkPrice = 10;
        int breadPrice  = 3;
        int waterPrice  = 17;
        System.out.printf("Меню \nМолоко %d \nХлеб %d \nВода %d \nВведите название товара: ",
                milkPrice, breadPrice, waterPrice);
        String buy = scanner.nextLine();
        System.out.print("Введите сумму: ");
        int userMoney = scanner.nextInt();

        int priceSelectedProduct =  switch (buy) {
            case "Молоко" -> milkPrice;
            case "Хлеб" -> breadPrice;
            case "Вода" -> waterPrice;
            default -> {
                System.out.println("Ошибка");
               yield  0;
            }
        };

        if (userMoney > priceSelectedProduct) {
            userMoney -= priceSelectedProduct;
            System.out.println("Ваша сдача: " + userMoney);

        } else if (userMoney == priceSelectedProduct) {
            System.out.println("Спасибо за покупку!");

        } else {
            System.out.println("Денег не хватает!");
        }
    }
}
