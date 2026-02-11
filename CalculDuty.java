import java.util.Scanner;

public class CalculDuty {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте");
        System.out.print("Введите вес (в кг.)");
        int a = scanner.nextInt();
        System.out.print("Введите сумму(в руб.");
        int b = scanner.nextInt();
        System.out.print("Сумма пошлины:");
        printMult(a, b);
    }

    public static void printMult(int a, int b) {
        int result = a * 100 + b / 100;
        System.out.println(result);
    }
}