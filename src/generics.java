// java generics: it means that allow class, method or interface to work with different data types
// while providing type safety.
public class generics<T> {
    T value;
    void setdetails(T value){
        this.value=value;

    }
    void display(){
        System.out.println(value);
    }
}
public  void main(String[]args){
    generics<String> s=new generics<>(); // T is a type paramater and set as diffeent data types like string, integer etc.
    s.setdetails("kiran");
    s.display();
    generics<Integer> i=new generics<>();
    i.setdetails(102);
    i.display();
}
