package javatcp.demo.tpc.kr.bit;

public class Book {
    // 설계 : 책 -> 제목, 가격, 출판사, 페이지 수...(상태정보 = 객체) + (행위정보 : 동작 = 메서드)
    // 객체설계 -> 객체생성
    // String = 문자열
    public String title;
    public Long price;
    public String company;
    public Long page;
}
