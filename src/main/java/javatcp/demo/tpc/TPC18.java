package javatcp.demo.tpc;

import javatcp.demo.tpc.kr.tpc.MovieVO;

public class TPC18 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10, 20, 30, 40, 50};

        int[] c = new int[] {10, 20, 30, 40, 50};

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "\n");
        }

        System.out.println();

        // 영화(제목, 가격, 주인공, 등급, 시간)
        MovieVO mv = new MovieVO("쌍화점", 12000, "송지효", 12, 1.3f);
        System.out.println("mv = " + mv);

        System.out.println();

        MovieVO[] marr = new MovieVO[3];
        marr[0] = new MovieVO("쌍화점", 12000, "송지효", 12, 1.3f);
        marr[1] = new MovieVO("쌍화탕", 22000, "꼬소허이", 12, 1.3f);
        marr[2] = new MovieVO("쌍권총", 15000, "탕탕탕", 12, 1.3f);

        System.out.println("marr = " + marr[0]);
        System.out.println("marr = " + marr[1]);
        System.out.println("marr = " + marr[2]);

        System.out.println();

        for (int i = 0; i < marr.length; i++) {
            System.out.println("marr.length = " + marr[i]);
        }
    }
}
