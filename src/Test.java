import java.util.Random;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        {
            System.out.println("Игра угодай число");
            Random rand = new Random();
            int randInt = rand.nextInt(10) + 1;
            while (true) {
                Scanner scan = new Scanner(System.in);
                int scaner = scan.nextInt();

                int randd = randInt;
                if (scaner < randd) {
                    System.out.println("Больше");

                } else if (scaner == randd) {
                    System.out.println("Верно");
                    break;

                } else if (scaner > randd) {
                    System.out.println("меньше");

                }
            }
        }
    }
}