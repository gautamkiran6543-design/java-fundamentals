public class box <T>{
    T value;
    public static void main(String[]args){
        box<Integer> s = new box<>(); // T is a type paramater it will be integer, string
        s.value=200;
        System.out.println("value"+s.value);
    }
}
