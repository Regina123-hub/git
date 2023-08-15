import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1.Сложить 
                2.Вычесть
                """);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        System.out.println(a+b);
    }
}