
    //create a class calculate which has three function to calculate area of circle , rectangle and triangle
// using the method overloading .
// Also test your class using object and then explain your program.
   import java.util.Scanner;
    public class areacalculation {
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
            Scanner sc=new Scanner(System.in);
            int length,breadth,base,height;
            System.out.println("enter a lenght");
            length = sc.nextInt();
            System.out.println("enter a Breadth");
            breadth=sc.nextInt();
            System.out.println("enter a base");
            base=sc.nextInt();
            System.out.println("enter a height");
            height =sc.nextInt();
            float radius;
            System.out.println("enter a radius");
             radius = sc.nextFloat();
            areacalculation obj= new areacalculation();
            obj.circle(radius);
            obj.rectangle(length,breadth);
            obj.triangle(base,height);
            sc.close();
        }


    }

