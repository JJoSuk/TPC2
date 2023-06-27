package javatcp.demo.tpc;

public class TPC09 {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;

        TPC09 tcp = new TPC09(); // heap Area(힙 위치에 생성)
        int v = tcp.sum(a, b);

        // a + b = ?
//        int v = sum(a, b); 이 방식으로는 static 이 아닌 메서드를 끌어올 수 없다.
        System.out.println("v = " + v);
    }

    public int sum(int a, int b) {
        int v = a + b;
        return v;
    }
}
