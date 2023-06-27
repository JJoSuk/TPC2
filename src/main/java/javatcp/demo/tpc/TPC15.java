package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();
        m.setName("홍길동");
        m.setAge(50);
        m.setTel("010-2222-2222");
        m.setAddress("부산");

        System.out.println("m.getName() = " + m.getName());
        System.out.println("m.getAge() = " + m.getAge());
        System.out.println("m.getTel() = " + m.getTel());
        System.out.println("m.getAddress() = " + m.getAddress());

//        m.name = "홍길동";
//        m.age = 50;
//        m.tel = "010-1111-1111";
//        m.address = "서울";
//
//        System.out.println("m.name = " + m.name);
//        System.out.println("m.age = " + m.age);
//        System.out.println("m.tel = " + m.tel);
//        System.out.println("m.address = " + m.address);
    }
}
