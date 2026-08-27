 public class inherit{
String parentclass(String name) {  // declaration
    return name; //defination
}
int parentclass(int age){
   return age;

}
}
public class child extends inherit {
    void childclass()

    {
        System.out.println("Here i inherit name and age from parent class" );
    }
}


public  void main(String[]args){// i didnot usw public
    child o1=new child(); // i create a object of child class
    o1.parentclass("Dog"); // calling inherit method
    System.out.println("name:"+ o1.parentclass("Dog"));
    o1.parentclass(25);
    System.out.println("age:"+ o1.parentclass(23));// this is also method call
    o1.childclass();
}