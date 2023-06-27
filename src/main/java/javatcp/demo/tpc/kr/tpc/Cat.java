package javatcp.demo.tpc.kr.tpc;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("고양이 처럼 먹자.");
    }

    public void night() {
        System.out.println("밤에서 눈이 빛이 난다.");
    }
}
