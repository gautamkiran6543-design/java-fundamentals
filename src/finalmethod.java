 public class finalmethod {
    final String name="kiran";
    final int age=5;
    final static void detail(String name,int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
    }
    class car extends finalmethod{
        //@Override
       // void detail(String name, int age){
            //compile error
            //cannot override a final method
            //error

        }

    }

    public void main(String[]args){
        finalmethod.detail("sauj",21);

    }

//}
