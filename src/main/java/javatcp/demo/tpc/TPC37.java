package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.infrine.ObjectArray;
import javatcp.demo.tpc.kr.tpc.A;
import javatcp.demo.tpc.kr.tpc.B;

import java.util.ArrayList;

public class TPC37 {
    public static void main(String[] args) {
//        ObjectArray arr = new ObjectArray(5);
        ArrayList arr = new ArrayList(5); // Object[], 배열의 길이에 제약이 없다.
        arr.add(new A());
        arr.add(new B());
        arr.add(new A());
        arr.add(new B());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());

        for (int i = 0; i < arr.size(); i++) {
            Object o = arr.get(i);
            if (o instanceof A) {
                ((A)o).go();
            } else {
                ((B)o).go();
            }
        }
    }
}
