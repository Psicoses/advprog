public class Main {
    
    public static void main(String[] args) {
        System.out.println(stockOracle(new int[]{7, 6, 4, 3, 1}));
        System.out.println(stockOracle(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public static int stockOracle(int[] x) {
        int max = 0;
        int min = 9999;

        for (int y = 0; y < x.length; y++) {
            if (x[y] < min) {
                min = x[y];
            }

            int profit = x[y] - min;
            if (profit > max) {
                max = profit;
            }
        }

        return max;
    }
}