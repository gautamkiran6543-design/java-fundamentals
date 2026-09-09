public class finalmethod {
    final String name="kiran";
    final int age=5;
    final static void detail(String name,int age){
        System.out.println("name="+name);
        System.out.println("age="+age);
    }
    public void main(String[]args){
        finalmethod.detail("sauj",21);

    }

}
