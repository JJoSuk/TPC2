package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.Animal;
import javatcp.demo.tpc.kr.tpc.Cat;
import javatcp.demo.tpc.kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {
        // Dog, Cat -> Animal 클래스에 상속
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();

        // Dog.java(X), Dog.class(O)
        // Dog dog2 = new Dog();


        // Animal <- [Dog.class, Cat.class]
        // Dog ani = new Dog();
        // ani.eat();
        // Animal ani = new Dog();
        // ani.eat();
        // ani = new Cat();
        // ani.eat();
    }
}
