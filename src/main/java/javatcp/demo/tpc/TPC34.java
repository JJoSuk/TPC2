package javatcp.demo.tpc;

public class TPC34 {
    public static void main(String[] args) {
        // String
        String str = new String("APPLE");
        String v = str.toLowerCase();
        System.out.println(v); // APPLE
        System.out.println(str.charAt(4)); // E
        System.out.println(str.length()); // 길이 : 5
        System.out.println(str.indexOf("PL")); // 있으면 P 의 스타트 포지션으로 값 출력, 2
        System.out.println(str.indexOf("PX")); // 없으면 -1 출력
        System.out.println(str.replaceAll("P", "X")); // AXXLE, P 라는 단어를 X 로 대체
    }
}
