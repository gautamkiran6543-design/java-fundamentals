 public class inherit{
void parentclass(){
    System.out.println("this is parent class. i used method");

}
}
public class child {
    void childclass()

    {
        System.out.println("thus is child class. i used method as weel");
    }
}
public  void main(String[]args){
    inherit o1=new inherit();
    o1.parentclass();
    child o2=new child();
    o2.childclass();

}