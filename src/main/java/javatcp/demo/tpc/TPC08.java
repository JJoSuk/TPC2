package javatcp.demo.tpc;

public class TPC08 {
    public static void main(String[] args) {
        // static method 끼리의 연관관계, static & non-static
        // static-zone 키워드는 고정된 위치에 자동으로 로딩을 해주는 키워드다.
        int a = 30;
        int b = 50;
        int result = add(a, b); // static method call
        System.out.println("result = " + result);
    }

    // static 이 있어야 서로 연동 가능.
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
