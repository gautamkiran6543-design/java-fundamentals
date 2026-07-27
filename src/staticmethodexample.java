public class staticmethodexample {
    static int display(int a,int b){
        return a-b;
    }
    static int mul(int c,int r){
        return c*r;
    }
    public static void main(String[]args){
        System.out.println(display(20,20));
        System.out.println(mul(5,2));
        System.out.println(display(20,20));
        System.out.println(mul(5,2));
    }
}
