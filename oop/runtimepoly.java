//Runtime poly:Runtime polymorphism = Parent reference + Child object + Method overriding + Method selection
// at runtime.
public abstract class runtimepoly {
    String name;
    String address;
    void show(String name, String address){
        System.out.println("Name="+name);
        System.out.println("address="+address);
        System.out.println("this is parent class so here i used overridr");
    }
}
public class poly extends runtimepoly{
    @Override
    //void show() // here method and parameters should same when we use override ,overriding parent to child class
            void show(String name,String address)
    {
        System.out.println("this is child class");
    }

}
public  void main(String[]args)
{
    runtimepoly ob; //parent reference
      ob= new poly(); //child object
    ob.show("kiran","itahari");
}