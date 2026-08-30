public class runtimepoly {
    String name;
    int num;
    double height;
    void show(int num, String name, double height){
        System.out.println("num="+num);
        System.out.println("name="+name);
        System.out.println("heigth="+height);
    }
    void show(String addresss, int roll, double salary){
        System.out.println("address="+addresss);

        System.out.println("roll="+roll);
        System.out.println("salaru="+salary);
    }
}
public  void main(String[]args){
    runtimepoly ob=new runtimepoly();
    ob.show(21,"kiran",5.7);
    ob.show("ith",45,430012.43);
}
