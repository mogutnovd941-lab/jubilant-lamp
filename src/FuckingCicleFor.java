import java.util.Scanner;

public class FuckingCicleFor {
    public static void main(String[] args) {
        boolean hit = true;
        String[] passwords = {"444444444", "yiyiyiyiyi", "qwertyuio"};
        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);

        String[] password = new String[7];

        while (hit) {
            String scan = scanner.next();
            for (int i = 0; i < passwords.length; i++) {
                if (scan.equals(passwords[i])) {
                    System.out.println("Такой пароль уже занят");
                }
            }
            if (scan.length() < 8) {
                System.out.println("Ваш пароль должен быть не менее 8 символов");
            }else if (scan.length() > 8){
                System.out.println("Пароль успешно создан");
                break;
            }
        }
    }
}