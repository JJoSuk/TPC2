package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.poly.RemoCon;
import javatcp.demo.tpc.kr.poly.Tv;

public class TPC28 {
    public static void main(String[] args) {
        // RemoCon 으로 TV 클래스를 구동하시오.
        RemoCon remoCon = new Tv();
        for (int i = 0; i < 40; i++) {
            remoCon.chUp();
        }
        for (int i = 0; i < 40; i++) {
            remoCon.chDown();
        }
        remoCon.internet();
    }
}
