package javatcp.demo.tpc.kr.poly;

public interface RemoCon { // 자체적으로 객체 생성x, RemoCon r = new RemoCon(); X
    // 상수를 사용해 변수처럼 자유롭게 수정하지 못하게 막는다.
    public static final int MinCH = 1;
    public static final int MaxCH = 100;

    // abstract 가 기본 적용된 상태라 생략해도 문제없다.
    public void chUp();
    public void chDown();
    public void internet();
}
