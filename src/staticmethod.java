//static method: it belongs to a class not a object to call .
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
        nonstaticmethod o=new nonstaticmethod();// here we used nn static where we create an object
        // if i used static method then we dont need to create an  object
        // we can also call using a class name like that staticmethod.details();
        details("Kiran","Itahari",21);// here it is directly call a value without an object that is
        //an static method.
        // here we accessing a value.
        o.gender=("male");
        o.number=(145);
        o.details();
    }
}
//non static object: it belongs to an object(inistance) of a class. we nedd to object to call.
 class nonstaticmethod{
    String gender;
    int number;
    void details(){
        System.out.println("gender:"+gender);
        System.out.println("number:"+number);
    }

}
// if we create nonstatic method in another file then we will written like this way but
// i create both method in one file so.
//public  void main(String[]args){
  //  nonstaticmethod o=new nonstaticmethod();
    //details("Kiran","Itahari",21);
    //o.gender=("male");
    //o.number=(145);
    //o.details();
//}