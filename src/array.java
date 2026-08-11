public class array {
    public static void main(String[] args) {
        String a[][] = {{"😊", "😊","😊", "😊", "😊"},
                         {"😊","😊","😊" ,"😊" ,"😊" }};
        int i,j;
        //row 0
        for (i = 0; i < a[0].length; i++) {
            System.out.print(a[0][i] + " ");

        }
        //row 1
        System.out.println(" ");
            for( j=0;j < a[1].length;j++){
            System.out.print(a[1][j]+" ");//[row][column]


        }

    }
}