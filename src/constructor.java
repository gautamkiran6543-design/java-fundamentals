public class constructor {
    int age;
    String name;
    double number1;
    double number2;
    constructor(String n,int a,double n1,double n2){
    name=n;
    age=a;
    number1=n1;
    number2=n2;

    }
    void setdetails(){
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("number1="+number1);
        System.out.println("number2="+number2);
    }
    void add(){
        double sum=number1+number2;
    }
    public static void main(String[]args){
        constructor c1=new constructor("kiran",21,100,200);
        c1.add();
        constructor c2=new constructor("sandesh",19,200,300);
        constructor c3=new constructor("ram",20,300,400);
        c1.setdetails();
        System.out.println();
        c2.setdetails();
        System.out.println();
        c3.setdetails();
        c2.add();
    }
}
