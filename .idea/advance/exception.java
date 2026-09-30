import java.io.IOException;
public class exception {
    static void checkage(int age)throws Exception{
        if(age>20){
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String[] args) {
        int age = 18;
        String name = "kiran";
        try {
            if (age > 20) {
                System.out.println("Eligible for vote");
            }
        }
            catch(Exception e){
                System.out.println("exception occured ");
            }
        }
    }

