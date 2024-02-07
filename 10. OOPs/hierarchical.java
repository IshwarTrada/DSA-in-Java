// Hierarchical Inheritance

public class hierarchical {
    public static void main(String[] args) {
        Mammals m = new Mammals();
        Fish f = new Fish();
        Bird b = new Bird();
        m.eat();
        f.braethe();
        b.eat();
    }
}
class Animal{
    String color;
    
    void eat(){
        System.out.println("eats");
    }

    void braethe(){
        System.out.println("braethes");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}