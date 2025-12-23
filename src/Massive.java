import java.util.Arrays;
import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean isCorrectName = false;
        String revers = "";
        while (!isCorrectName){
         isCorrectName = checkWord(name);
        }
    }

    public static void reverses(String name, String revers) {
        for (int i = name.length() - 1; i >= 0; i--) {
            revers += name.charAt(i);

        }
        System.out.println(revers);
    }

    public static boolean checkWord(String name) {
        if (name.split(" ").length == 1) {
            return true;
        }else  return false;
    }
}