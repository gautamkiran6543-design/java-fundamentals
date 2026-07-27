public class pyramid {
    public static void main(String[]args){
        {
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
        }
        int i;
        int j;
        for(i=1;i<=5;i++){ //outerloop
            for(j=1;j<=i;j++){ //innerloop
                System.out.print(j);
            }
            System.out.println(" ");

        }

    }
}
