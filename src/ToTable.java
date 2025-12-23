public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.y = y;
        this.x = x;
    }

    int[][] resise() {
        int[][] massive = new int[x][y];
        int start = 0;
        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                massive[i][j - start] = data[j];
            }
            start += y;
        }return massive;
    }
}