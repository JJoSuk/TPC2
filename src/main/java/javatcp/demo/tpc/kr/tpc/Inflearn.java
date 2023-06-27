package javatcp.demo.tpc.kr.tpc;

public class Inflearn {
    // private 이라도 static 이 있으면 생성자 없이 출력 가능하다.
    private Inflearn() {
    }

    // 인스턴스 메서드
    public static void tpc() {
        System.out.println("TPC 강의 듣는 중...");
    }

    // 클래스 메서드
    public static void java() {
        System.out.println("Java 강의 듣는 중...");
    }
}
