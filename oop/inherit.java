 public class inherit{
String parentclass(String name) {
    return name;
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
    o1.parentclass(25);
    o1.childclass();
}