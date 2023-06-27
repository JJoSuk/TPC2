package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.poly.Animal;
import javatcp.demo.tpc.kr.poly.Cat;
import javatcp.demo.tpc.kr.poly.Dog;

public class TPC26 {
    public static void main(String[] args) {
        // upcasting(부모의 엿할로 사용 -> 명령을 내리는 쪽)
        Animal animal = new Dog();
        animal.eat(); // override 된 eat 의 메서드가 소환된다.
        animal.move();

        animal = new Cat();
        animal.eat(); // {Animal} --> {고양이}
        animal.move();
        ((Cat)animal).night();
    }
}
