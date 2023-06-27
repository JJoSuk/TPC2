package javatcp.demo.tpc.kr.poly;

public abstract class Animal { // 추상 클래스
    // abstract : 추상클래스, 불완전한 객체
    public abstract void eat(); // 추상 메서드

    public void move() {
        System.out.println("무리를 지어서 이동한다.");
    }
}
