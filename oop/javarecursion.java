//Recursion:it means method calls repeatly until the condition called the base case is reached.
//void method() {
//
//    if (condition) {
//        return;          // base case
//    }
//
//    method();            // recursive call
//}

public class javarecursion {
     static void count(int number) { // here we use static method
        if (number == 10) {
            return;
        }
        System.out.println(+number);

count(number+1);

}

    public void main(String[] args) {
        count(1); // recursive method directly call without object
    }
}
//vs loop
//for(int i=1;i<=10;i++){
    //System.out.println(i);
      //  }