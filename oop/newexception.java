
public class newexception {
    public static void main(String[]args){
        try{ //put the exception that occur in try
            int result=10/0;
        }
        catch(Exception e){ // handle exception that occur in try
            System.out.println("in this case exception occured");
        }
        finally{ // always run even exception occur or not
            System.out.println("program runs");
        }
    }
}
