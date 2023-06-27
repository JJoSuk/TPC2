package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.Inflearn;

public class TPC13 {
    public static void main(String[] args) {
        // Inflearn inf = new Inflearn();
        // inf.tpc();
        Inflearn.tpc();
        // inf.java();
        Inflearn.java();

        // Java API 생성자 private
        // System sys = new System();
        System.out.println("출력");
        // Math m = new Math();
        int v = Math.max(10, 20);
        System.out.println("v = " + v);
    }
}
