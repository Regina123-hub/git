import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (input != 3) {
            System.out.println("""
                     1.Сложить 
                     2.Вычесть
                     3.Выход
                    """);
            input = scanner.nextInt();

            switch (input) {
                case 1 -> {
                    System.out.println("Enter number: ");
                    int a = scanner.nextInt();
                    System.out.println("Enter number: ");
                    int b = scanner.nextInt();
                    System.out.println(a + b);
                }
                case 2 -> {
                    System.out.println("Enter number: ");
                    int a = scanner.nextInt();
                    System.out.println("Enter number: ");
                    int b = scanner.nextInt();
                    System.out.println(a - b);
                }

            }

        }

    }
}