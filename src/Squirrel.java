public class Squirrel {
    int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    int getNuts(int n) {
        return nuts[n];
    }

    int maxNuts() {
        if (nuts.length > 1) {
            int[] arr = nuts.clone();
            arr[1] = max(arr[0], arr[0] + arr[1]);
            if (arr[1] < 0) arr[1] = 0;

            for (int i = 2; i < arr.length; i++) {
                arr[i] = max(arr[i] + arr[i - 1], arr[i] + arr[i - 2]);
                if (arr[i] < 0) arr[i] = 0;
            }
            int a = Math.max(arr.length - 1, arr.length - 2);
            return max(0, a);
        }else return max(0, nuts[0]);
    }
    private int max(int x, int y) {
        if (x >= y) return x;
        return y;
    }
}