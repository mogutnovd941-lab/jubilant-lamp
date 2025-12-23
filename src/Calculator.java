import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первый символ");
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        System.out.println("Введите операцию");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второй символ");
        int operand2 = sc.nextInt();
        if (operation == '+') {
            int result = operand1 + operand2;
            System.out.println("Получите распишитесь: " + result);
        }
        if (operation == '-') {
            int result = operand1 - operand2;
            System.out.println("Получите распишитесь: " + result);
        }
        if (operation == '*') {
            int result = operand1 * operand2;
            System.out.println("Получите распишитесь: " + result);
        }
        if (operation == '/') {
            float result = operand1 / operand2;
            System.out.println("Получите распишитесь: " + result);
        }
    }
}