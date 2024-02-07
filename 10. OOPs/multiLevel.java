// Multi level Inheritance


public class multiLevel {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.eat();
        tommy.braethe();
        tommy.legs = 4;
        System.out.println(tommy.legs);
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
    int legs;
}

class Dog extends Mammals{
    String breed;
}

