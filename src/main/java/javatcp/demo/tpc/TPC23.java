package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.Animal;
import javatcp.demo.tpc.kr.tpc.Cat;
import javatcp.demo.tpc.kr.tpc.Dog;

public class TPC23 {
    public static void main(String[] args) {
        // Upcasting
        Animal ani = new Cat();
        ani.eat(); // 컴파일 시점 Animal, 실행 시점 Dog
        // Cat cat = (Cat)ani; // 이렇게 다운캐스팅 후 출력도 가능하고 아래처럼도 가능하다.
        ((Cat)ani).night();

        ani = new Dog();
        ani.eat();
        ((Dog)ani).eat();

        // 다형성
        // 상위 클래스가 하위 클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
        Object ob = new Cat();
        // ob.eat(); 이 방식으로 불러올 수 없고 다운캐스팅 방식을 사용해 불러올 수 있다.
        ((Cat)ob).night();
    }
}
