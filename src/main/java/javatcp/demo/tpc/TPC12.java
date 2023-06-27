package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        // 생성자 -> 생성 + 초기화 -> 중복정의
        BookVO book1 = new BookVO();
        // 이미 초기화 작업을 했기에 추가로 더 넣을 필요없다.
//        boo1k.title = "오라클";
        System.out.println("boo1k.title = " + book1.title);
        System.out.println("boo1k.price = " + book1.price);
        System.out.println("boo1k.company = " + book1.company);
        System.out.println("boo1k.page = " + book1.page);

        System.out.println("\n여기서 책 한 권을 더 추가한다고 해서 값이 변경되지 않는다.\n");

        BookVO book2 = new BookVO();
        // 이미 초기화 작업을 했기에 추가로 더 넣을 필요없다.
        System.out.println("boo1k.title = " + book2.title);
        System.out.println("boo1k.price = " + book2.price);
        System.out.println("boo1k.company = " + book2.company);
        System.out.println("boo1k.page = " + book2.page);

        System.out.println("\n하지만 지금과 같은 방식을 사용하면 값이 유동적으로 수정할 수 있다.\n");

        BookVO book3 = new BookVO("HTML", 18000, "홈페이지", 1000);
        System.out.println("boo1k.title = " + book3.title);
        System.out.println("boo1k.price = " + book3.price);
        System.out.println("boo1k.company = " + book3.company);
        System.out.println("boo1k.page = " + book3.page);
    }
}
