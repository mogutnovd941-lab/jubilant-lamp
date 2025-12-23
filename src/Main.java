import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] evaluetion = {{2, 0, 0}, {0, 0, 2}, {2, 0, 0}};
            for (int i = 0; i < evaluetion.length; i++) {
                for (int j = 0; j < evaluetion[0].length; j++) {
                    if (evaluetion[i][j] == 2) evaluetion[i][j] = 5;
                    System.out.println(Arrays.deepToString(evaluetion));
                }
            }
        }
    }