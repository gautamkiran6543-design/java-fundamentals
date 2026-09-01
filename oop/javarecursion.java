public class javarecursion {
    static void count(int number) {
        if (number == 10) {
            return;
        }
        System.out.println(+number);


    count(number+1);
}

    public void main(String[] args) {
        count(1);
    }
}
