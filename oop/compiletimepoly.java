//compile time polymorphism: the method are executied decide by the compiler at a compile time.
// same method name but diffeent parameters
public class compiletimepoly {
    String name;
    int num;
    double height;

        void show ( int num, String name,double height){
        System.out.println("num=" + num);
        System.out.println("name=" + name);
        System.out.println("heigth=" + height);
    }
        void show (String addresss,int roll, double salary){
        System.out.println("address=" + addresss);

        System.out.println("roll=" + roll);
        System.out.println("salaru=" + salary);
    }
    }
public  void main(String[]args) {
    compiletimepoly ob = new compiletimepoly();
        ob.show(21, "kiran", 5.7);// calls show(int String int)
        ob.show("ith", 45, 430012.43);// calls(String, int, double)

    //The compiler looks at the number and type of arguments and determines which show() method should be used.
    }
