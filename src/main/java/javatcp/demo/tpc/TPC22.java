package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.Animal;
import javatcp.demo.tpc.kr.tpc.Cat;
import javatcp.demo.tpc.kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.night();

        // Dog.class, Cat.class
        Animal ani1 = new Dog(); // Upcasting
        ani1.eat();

        Animal ani2 = new Cat(); // Upcasting
        ani2.eat();
        ((Cat)ani2).night(); // Downcasting
    }
}
