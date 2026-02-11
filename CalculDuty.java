import java.util.Scanner;

public class CalculDuty {
    public static String result;
    public static void Scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте");
        System.out.print("Введите вес (в кг.)");
        int weight = scanner.nextInt();
        System.out.print("Введите сумму(в руб.");
        int price = scanner.nextInt();
        System.out.print("Сумма пошлины:");
        Duty(weight, price);
    }

    public static void Duty(int weight, int price) {
        int result = weight * 100 + price / 100;
        return result;
    }
    public static void main(String[] args) {
        Scanner();
        System.out.println(result);
    }
}