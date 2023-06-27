package javatcp.demo.tpc;

public class TPC06 {
    public static void main(String[] args) {
        // 메서드 관련 : 동작(method), 기능(function)
        int a = 55;
        int b = 66;
        // a + b = ?
        int result = sum(a, b);
        System.out.println(result);

        int[] arr = makeArr();
        int hap = 0;
        for (int i = 0; i < arr.length; i++) {
            hap += arr[i];
        }
        System.out.println(hap);
    }
    // 예를 들어 정수 2개를 매개변수로 받아서 총합을 구하여 리턴하는 메서드를 정의하시오.
    public static int sum(int a, int b) {
        int v = a + b;
        return v;
    }

    // 10, 20, 30 정수 데이터를 리턴하고 싶다면?
    public static int[] makeArr() {
        int x = 10;
        int y = 20;
        int z = 30;

        int[] arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;

        return arr;
    }
}
