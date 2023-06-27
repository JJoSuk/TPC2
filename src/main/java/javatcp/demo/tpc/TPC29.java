package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.DbConnect;
import javatcp.demo.tpc.kr.tpc.JavaMySQL;
import javatcp.demo.tpc.kr.tpc.JavaOracle;

public class TPC29 {
    public static void main(String[] args) {
        // Oracle, MySQL -> 연결하기 위해서는 드라이버 클래스가 필요하다.
        DbConnect conn = new JavaOracle();
        conn.getConnection("url", "bit", "1234");

        conn = new JavaMySQL();
        conn.getConnection("url", "biit", "1234");
    }
}
