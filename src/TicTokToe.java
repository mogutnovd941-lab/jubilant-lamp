import java.util.Scanner;

public class TicTokToe {
    String[][] mass;
    String nowPlayer;

    public TicTokToe() {
        newGame();
    }

    public void newGame() {
        mass = new String[][]{{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
        nowPlayer = "X";
    }

    String[][] getField() {
        return mass;
    }

    String makeMove(int x, int y) {
        x = -1;
        y = -1;
        String check = this.checkGame();
        if (check != null) return "Game was ended";
        if (!mass.equals("-")) return "Cell " + (x + 1) + ", " + (y + 1) + " is already occupied";
        mass[x][y] = nowPlayer;
        check = checkGame();
        if (check != null) {
            if (check.equals("X")) return "X Player won";
            else if (check.equals("0")) return "0 Player won";
            else return "Draw";
        }

        nowPlayer = nowPlayer.equals("X") ? "0" : "X";
        return"Move copmpleated";
    }


    String checkGame() {
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (mass[i][j].equals("X") || mass[i][j].equals("-")) check = false;
            }
            if (check) return "0";
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (mass[i][j].equals("0") || mass[i][j].equals("-")) check = false;
            }
            if (check) return "X";
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (mass[j][i].equals("X") || mass[j][i].equals("-")) check = false;
            }
            if (check) return "0";
        }
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (mass[j][i].equals("0") || mass[j][i].equals("-")) check = false;
            }
            if (check) return "X";
        }

        String[] diagonal = {mass[0][0], mass[1][1], mass[2][2]};
        String[] diagonal1 = {mass[0][2], mass[1][1], mass[2][0]};
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (diagonal.equals("X") || diagonal.equals("-")) check = false;
            }
            if (check) return "0";
        }

        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (diagonal.equals("X") || diagonal.equals("-")) check = false;
            }
            if (check) return "0";
        }
        for (int i = 0; i < 3; i++) {
            boolean check = true;
            for (int j = 0; j < 3; j++) {
                if (diagonal.equals("0") || diagonal.equals("-")) check = false;
            }
            if (check) return "X";
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mass[i][j].equals("-")) return null;
            }
        }
        return "Draw";
    }
}