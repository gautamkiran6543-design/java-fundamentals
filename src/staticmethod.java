public class staticmethod {
    String name;
    String address;
    int age;
    static void details(String name, String address,int age){
        System.out.println("Name:"+name);
        System.out.println("address:"+address);
        System.out.println("age:"+age);

    }
    public static void main(String[]args){
        // if i used static method then we dont need to create an  object
        // we can also call using a class name like that staticmethod.details();
        details("Kiran","Itahari",21);
    }
}
