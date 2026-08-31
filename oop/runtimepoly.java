public class runtimepoly {
    String name;
    String address;
    void show(String name, String address){
        System.out.println("Name="+name);
        System.out.println("address="+address);
        System.out.println("this is parent class so here i used overridr");
    }

}
public class poly extends runtimepoly{
    void show(){
        System.out.println("this is child class");
    }

}
public  void main(String[]args)
{
    poly  ob= new poly();
    ob.show("kiran","itahari");
    ob.show();
}