public class a {
    public static void main(String[]args) {
        int[][] a = {{1, 2, 3},
                {2, 3, 4}};
        int[][] b = {{4, 5, 6},
                {5, 6, 7}};
        int[][] sum = new int[2][3]; //row and column
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }
    }}
