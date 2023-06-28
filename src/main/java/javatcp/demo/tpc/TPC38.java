package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {
        // ArrayList 는 복합적으로 Object 를 통해 넣을 수 있지만, 보통 책을 넣을 때 책만 넣고, 멤버만 넣을 때 멤버만 넣는다.
        List<BookDTO> list = new ArrayList<BookDTO>();
        list.add(new BookDTO("자바1", 12000, "이지스", 600));
        list.add(new BookDTO("C언어", 13000, "에이콘", 620));
        list.add(new BookDTO("Python", 15000, "제이펍", 650));

        for (int i = 0; i < list.size(); i++) {
            // Object o = list.get(i);
            BookDTO vo = list.get(i);
            System.out.println("vo = " + vo.toString());
        }
    }
}
