//create a class calculate which has three function to calculate area of circle , rectangle and triangle
// using the method overloading .
// Also test your class using object and then explain your program.
public class calculator{
    double Area;
    void rectangle(int length,int breadth){
        Area= length*breadth;
        System.out.println("Area of rectangle="+(Area));

    }
    void circle(float radius){
        Area= 3.14*radius;
        System.out.println("Area of circle="+(Area));
    }
    void triangle(int base,int height){
        Area=0.5*base*height;
        System.out.println("Area of triangle="+(Area));
    }
    public static void main(String[]args){
        calculator obj= new calculator();
        obj.circle(6);
        obj.rectangle(5,3);
        obj.triangle(3,6);
    }

}