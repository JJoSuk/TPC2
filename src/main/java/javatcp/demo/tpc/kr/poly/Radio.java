package javatcp.demo.tpc.kr.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("라디오 채널 위로 올리기.");
    }

    @Override
    public void chDown() {
        System.out.println("라디오 채널 아래로 내리기.");
    }

    @Override
    public void internet() {
        System.out.println("인터넷을 지원하지 않습니다.");
    }
}
