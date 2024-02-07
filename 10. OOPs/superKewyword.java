// super keyword

public class superKewyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor");
    }
}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "brown";
        System.out.println("Horse Constructor");
    }
}