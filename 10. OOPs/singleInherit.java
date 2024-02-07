// Single Level Inheritance

public class singleInherit {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
