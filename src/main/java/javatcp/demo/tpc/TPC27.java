package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.poly.Radio;
import javatcp.demo.tpc.kr.poly.RemoCon;
import javatcp.demo.tpc.kr.poly.Tv;

public class TPC27 {
    public static void main(String[] args) {
        RemoCon remoCon = new Tv();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.internet();

        System.out.println();

        remoCon = new Radio();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.internet();
    }
}
