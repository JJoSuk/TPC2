package javatcp.demo.tpc;

public class TPC05 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println(sum);

        // 9개의 정수형 변수를 만들어라. -> 2차원 구조
        int[][] arr2 = new int[3][3];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;

        arr2[1][0] = 1;
        arr2[1][1] = 2;
        arr2[1][2] = 3;

        arr2[2][0] = 1;
        arr2[2][1] = 2;
        arr2[2][2] = 3;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

        // 가변길이 배열
        int[][] star = new int[5][];
        star[0] = new int[1];
        star[1] = new int[2];
        star[2] = new int[3];
        star[3] = new int[4];
        star[4] = new int[5];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                star[i][j] = '*';
                System.out.print((char) star[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
