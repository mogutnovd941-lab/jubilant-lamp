import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        int operand1 = sc.nextInt();
        System.out.println("Введите операцию");
        char operation = sc.next().charAt(0);
        System.out.println("Введите второе число");
        int operand2 = sc.nextInt();
        if (operation == '+') {
            int result = operand1 + operand2;
            System.out.println("результат: " + result);
        }
        else if (operation == '-') {
            int result = operand1 - operand2;
            System.out.println("Получите распишитесь: " + result);
        }
        else if (operation == '*') {
            int result = operand1 * operand2;
            System.out.println("Получите распишитесь: " + result);
        }
        else if (operation == '/') {
            float result = operand1 / operand2;
            System.out.println("Получите распишитесь: " + result);
        }
        else {
            System.out.println("Операция не поддерживается");
        }
    }
}