package javatcp.demo.tpc.kr.tpc;

public class MyUtil {
    public int hap() {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        return sum;
    }
}
