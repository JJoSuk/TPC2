package javatcp.demo.tpc.kr.tpc;

public class BookDTO {
    public String title;
    public int price;
    public String company;
    public int page;

    // 아래와 같이 디폴트 생성자 메서드가 생략되어 있다.
    public BookDTO() {
//        super();
    }

    public BookDTO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
