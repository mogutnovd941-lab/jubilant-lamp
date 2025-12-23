public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resise() {
        int [] massive = new int[data.length * data[0].length];
        int start = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                massive[start] = data[i][j];
                start++;
            }
        }return massive;
    }
}