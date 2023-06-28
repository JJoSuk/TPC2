package javatcp.demo.tpc.kr.poly;

public class A extends Object {
    public A() { // 이 부분이 생략되어 있다.
        super();
    }

    public void display() {
        System.out.println("나는 A 이다.");
    }

    @Override
    public String toString() {
        return "재정의 메서드 입니다.";
    }
}
