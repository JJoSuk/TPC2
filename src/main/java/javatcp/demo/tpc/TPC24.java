package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.Animal;
import javatcp.demo.tpc.kr.tpc.Cat;
import javatcp.demo.tpc.kr.tpc.Dog;

public class TPC24 {
    public static void main(String[] args) {
        // 1. 다형성인수
        Dog dog = new Dog();
        display(dog);
        Cat cat = new Cat();
        display(cat);
    }

    private static void display(Animal r) { // 다형성인수
        r.eat(); // upcasting
        if (r instanceof Cat) { // downcasting
            ((Cat)r).night();
        }
    }
}
