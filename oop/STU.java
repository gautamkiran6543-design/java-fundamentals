//generics means that allow method, class and interface to work with different data types while providing type safety.
// here T & U are the type paramaters that is used when to work with different data types.
public class STU<T,U> {
    T name;
    U age;
    STU(T name, U age){ // i use constructor in here
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[]args){
        STU<String,Integer> obj=new STU<>("Kiran",21); // i call the constructor
        obj.display();
    }
}
