package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.poly.A;

public class TPC30 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println("a.toString() = " + a.toString());
        System.out.println("a.toString() = " + a); // Object -> toString

        Object o = new A(); // upcasting
        ((A)o).toString();
        System.out.println(o.toString());
    }
}
