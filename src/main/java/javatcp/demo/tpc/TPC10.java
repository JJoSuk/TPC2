package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // 기본자료형 : int, float, char, boolean -> PDT
        int a;
        a = 10;

        // 만약 책이라는 자료형을 만들고 싶다면 -> 사용자정의자료형 class 이용해서 생성자를 만들면 된다.
        // 객체 생성
        BookDTO book = new BookDTO();
        book.title = "테스트";
        book.price = 10000;
        book.company = "TestCompany";
        book.page = 500;

        System.out.println("book.title = " + book.title);
        System.out.println("book.price = " + book.price);
        System.out.println("book.company = " + book.company);
        System.out.println("book.page = " + book.page);
    }
}
