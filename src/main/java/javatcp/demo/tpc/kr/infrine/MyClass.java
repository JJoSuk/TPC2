package javatcp.demo.tpc.kr.infrine;

// public 이 생략되어 있다면 default 가 자동인식 된다.(접근 못하게 막는다, 그래서 public 을 써서 접근 가능하게 해야한다.)
public class MyClass {
    public int sum(int a, int b) {
        int hap = 0;
        for (int i = a; i <= b; i++) {
            hap += i;
        }
        return hap;
    }
}
