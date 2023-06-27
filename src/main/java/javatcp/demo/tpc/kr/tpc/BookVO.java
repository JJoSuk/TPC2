package javatcp.demo.tpc.kr.tpc;

public class BookVO {
    public String title;
    public int price;
    public String company;
    public int page;

    // 디폴드된 생성자 메서드
    public BookVO() {
        // 초기화 작업 : 하지만 값을 넣어 고정하는건 좋지 않다.
        title = "자바";
        price = 10004;
        company = "Test";
        page = 125;
    }

    // 생성자 메서드의 중복정의(OverLoading)
    // 중복정의 : 비슷한 형태의 동작방식을 하게된다면 중복정의를 사용해 메서드를 만들어도 상관없다.
    public BookVO(String title, int price, String company, int page) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.page = page;
    }
}
