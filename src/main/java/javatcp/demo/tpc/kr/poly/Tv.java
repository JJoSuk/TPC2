package javatcp.demo.tpc.kr.poly;

public class Tv implements RemoCon {
    int currCH = 70;

    @Override
    public void chUp() {
        if (currCH < RemoCon.MaxCH) {
            currCH++;
            System.out.println("TV 의 채널이 올라갑니다. : " + currCH);
        } else {
            currCH=1;
            System.out.println("TV 의 채널이 올라갑니다. : " + currCH);
        }
    }

    @Override
    public void chDown() {
        if (currCH > RemoCon.MinCH) {
            currCH--;
            System.out.println("TV의 채널이 내려갑니다. : " + currCH);
        } else {
            currCH = 100;
            System.out.println("TV의 채널이 내려갑니다. : " + currCH);
        }
    }

    @Override
    public void internet() {
        System.out.println("인터넷 작동.");
    }
    // 추가적인 기능을 구현...
}
