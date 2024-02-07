// Hybrid Inheritance

public class hybrid {
    public static void main(String[] args) {
        Mammals m = new Mammals();
        Fish f = new Fish();
        Shark s = new Shark();
        Bird b = new Bird();
        m.eat();
        f.braethe();
        b.eat();
        s.swim();
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

class Shark extends Fish{
    void shark(){
        System.out.println("shark");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
