package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        // 책 1권을 저장하기 위해 객체를 생성.
        BookVO book1 = new BookVO();
        book1.title = "파이썬";
        book1.price = 10000;
        book1.company = "테스트";
        book1.page = 400;

        System.out.println("book.title = " + book1.title);
        System.out.println("book.price = " + book1.price);
        System.out.println("book.company = " + book1.company);
        System.out.println("book.page = " + book1.page);

        BookVO book2 = new BookVO();
        book2.title = "오라클";
        book2.price = 20000;
        book2.company = "테스트";
        book2.page = 1000;

        System.out.println("=================");

        System.out.println("book.title = " + book2.title);
        System.out.println("book.price = " + book2.price);
        System.out.println("book.company = " + book2.company);
        System.out.println("book.page = " + book2.page);
    }
}
