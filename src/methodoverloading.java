//methodoverloaing: it means having same method name but different parameters or arguments list.
//rules: method name must be the same but parameters are different.
//static and non static methods can be overloaded,access modifiers can be different

public class methodoverloading {
    int a,b;
    double c,d;
    int calculate(int a, int b){
        return a+b;
    }
    int calculate(int a, int b, int c){
        return(a+b)-c;
    }
    double calculate(int a, int b, double c, double d){
        return (a*b)/(c*d);
    }
}
public void main(String[]args){
    methodoverloading obj=new methodoverloading();
    //obj.calculate(3,4);
    System.out.println(+obj.calculate(3,4));
    //obj.calculate(4,5,6);
    System.out.println(+obj.calculate(4,5,6));
    //obj.calculate(5,6,7);
    System.out.println(+obj.calculate(5,6,7,8));
}
