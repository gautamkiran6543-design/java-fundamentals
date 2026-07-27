public class methodexample {
    int display(int a,int b) {
        System.out.println("addition="+(a+b));
        return a + b;
    }
        int sub(int a,int b){
        System.out.println("subtraction="+(a-b));
        return a-b;
    }
    public static void main(String[]args){
        methodexample obj= new methodexample();
        obj.display(10,20);
        obj.sub(20,10);

    }
}
