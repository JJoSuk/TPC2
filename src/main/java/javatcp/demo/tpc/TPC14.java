package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.BookDTO;

public class TPC14 {
    public static void main(String[] args) {
        // 책 -> class(BookDTO) -> 객체 -> 인스턴스
        String title = "스프링";
        int price = 25000;
        String company = "TEST";
        int page = 899;

        BookDTO dto = new BookDTO(title, price, company, page); // dto 란 객체 안에 BookDTO 정보를 주입해 인스턴스 화
        bookPrint(dto);
    }

    public static void bookPrint(BookDTO dto) {
        System.out.println("dto.title = " + dto.title);
        System.out.println("dto.price = " + dto.price);
        System.out.println("dto.company = " + dto.company);
        System.out.println("dto.page = " + dto.page);
    }
}
