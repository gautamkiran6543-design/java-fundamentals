
//abstraction means hiding unnesseary details and showing what is necessary.
//To focus on what an object does, without showing how it does it.
//when multiple class follow same basic rule but have different implementations.
abstract class CircleAbstract {

    double area;
    double volume;

    abstract void volume(double radius);

    void area(double radius) {
        area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }
}

class Cone extends CircleAbstract {

    void volume(double radius) {
        volume = (4.0 / 3.0) * 3.14 * radius * radius * radius;
        System.out.println("Volume: " + volume);
    }
}


    public  void main(String[] args) {

        Cone obj = new Cone();

        obj.area(3.5);
        obj.volume(2.4);
    }



