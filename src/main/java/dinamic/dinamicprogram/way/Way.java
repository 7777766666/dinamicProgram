package dinamic.dinamicprogram.way;

public class Way {

    public static void main(String[] args) {

        Way way = new Way();
        int n = 20;
        int m = 20;


        long start1 = System.nanoTime();
        int result1 = way.anyWay(n, m);
        long finish1 = System.nanoTime();
        System.out.println(((finish1 - start1) / 1000) + "  first method time");
        long start2 = System.nanoTime();
        int dinamic = way.dinamic(n, m);
        long end2 = System.nanoTime();
        System.out.println(((end2 - start2) / 1000) + "  second finish");
        System.out.println(dinamic == result1);

    }


    private int anyWay(int n, int m) {

        if (n < 1 || m < 1)
            return 0;

        if (n == 1 && m == 1)
            return 1;


        return anyWay(n - 1, m) + anyWay(n, m - 1);
    }

    private int dinamic(int n, int m) {
        return finaResult(n, m, new int[n + 1][m + 1]);
    }

    private int finaResult(int n, int m, int[][] x) {

        if (n < 1 || m < 1) return 0;

        if (n ==1 || m == 1) return 1;

        if (x[n][m] != 0) return x[n][m];

        x[n][m] = finaResult(n -1, m, x) + finaResult(n, m - 1, x);

        return x[n][m];


    }


}
