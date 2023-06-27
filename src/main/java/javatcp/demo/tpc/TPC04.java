package javatcp.demo.tpc;

public class TPC04 {
    public static void main(String[] args) {
        // 데이터 이동 (변수 VS 배열)
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;

        // a + b + c = ? 메서드 처리 -> hap()
        hap(a, b, c);

        // 다른 방법1
        int[] arr = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        hap1(arr);

        // 다른 방법2
        int[] x = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        hap1(arr);
    }
    public static void hap(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("int = " + sum);
    }

    public static void hap1(int[] arr) {
        // 반복문 활용 - for, while
        int sum = arr[0] + arr[1] + arr[2];
        System.out.println("arr = " + sum);
    }

    public static void hap2(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.println("x = " + sum);
        }
    }
}
