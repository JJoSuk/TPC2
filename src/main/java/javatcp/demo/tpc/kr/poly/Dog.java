package javatcp.demo.tpc.kr.poly;

public class Dog extends Animal {
    // 재정의 Override
    // Override 는 자동생성 해줘서 생략해줘도 문제없다.
    @Override
    public void eat() {
        System.out.println("개 처럼 먹자.");
    }
}
