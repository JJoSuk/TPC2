package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.Animal;
import javatcp.demo.tpc.kr.tpc.Cat;
import javatcp.demo.tpc.kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        // 재정의 override 를 사용했기에 animal 의 부모클래스를 사용하지 않았다.
        // 부모 = 자식
        Dog dog = new Dog();
        dog.eat(); // ? 인 답변을 dog 메서드에 재정의해 개 처럼 먹자 라는 문구가 출력됐다.

        System.out.println();

        Cat cat = new Cat();
        cat.eat();
        cat.night();

        System.out.println();

        // Dog.class, Cat.class
        Animal ani1 = new Dog();
        ani1.eat();

        Animal ani2 = new Cat();
        ani2.eat();
        // cat 에만 있는 night 같은 경우 다운 캐스팅을 이용해 불러와야 한다. -> ((부모)클래스명).객체명();
        ((Cat)ani2).night();
    }
}
