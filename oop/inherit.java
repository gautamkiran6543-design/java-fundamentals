 public class inherit{
void parentclass(){
    System.out.println("this is parent class. i used method");

}
}
public class child extends inherit {
    void childclass()

    {
        System.out.println("thus is child class. i used method as weel");
    }
}
public  void main(String[]args){// i didnot usw public
    inherit o1=new inherit();
    o1.parentclass();//calling method using object
    child o2=new child();
    o2.childclass();
    o2.parentclass();
    o2.parentclass();

}