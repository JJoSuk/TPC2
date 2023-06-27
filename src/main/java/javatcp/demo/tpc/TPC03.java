package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.bit.Book;
import javatcp.demo.tpc.kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계에 대한 이해 PDT(기본자료형) VS UDDT(사용자정의자료형)
        // 정수 1개를 저장하기 위한 변수를 선언.
        int a;

        // 책 1권을 저장하기 위한 변수를 선언.
        Book b = new Book();
        b.title = "자바";
        b.price = 15000L;
        b.company = "테스트미디어";
        b.page = 500L;

        System.out.println("title = " + b.title);
        System.out.println("price = " + b.price);
        System.out.println("company = " + b.company);
        System.out.println("page = " + b.page);

        PersonVO personVO = new PersonVO();
        personVO.age = 20;
        personVO.name = "홍길동";
        personVO.height = 179.5F;
        personVO.weight = 81.2F;

        System.out.println("이름 = " + personVO.name + ", 나이 = " + personVO.age +
                ", 키 = " + personVO.height + ", 몸무게 = " + personVO.weight);
    }
}
