package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.MemberVO;

public class TPC16 {
    public static void main(String[] args) {
        // 바로 불러오면 Setter Method 를 따로 만들지 않아도 된다.
        MemberVO m = new MemberVO("홍길동", 50, "010-1111-2222", "서울");
        // toString 은 제대로 정보가 들어왔는지 확인하는 방법으로도 효율이 좋다.
        System.out.println("사용자 정보 = " + m.toString());
        // toString 자동 등록이기에 생략해도 toString 메소드를 호출할 수 있다.
        System.out.println("m = " + m);
    }
}
