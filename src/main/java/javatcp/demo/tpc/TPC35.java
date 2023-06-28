package javatcp.demo.tpc;

public class TPC35 {
    public static void main(String[] args) {
        String str1 = new String("APPLE");
        String str2 = new String("APPLE");

        // 서로 같은 결과를 가지고 있어 YES 라고 나올꺼라 착각하기 쉽지만 각각 다른 객체에 들어가 있어
        // 결과적으로 서로 다른 결과값을 가지고 있다.
        // 만약 다른 결과값을 가지고 있게 하고 싶다면 다른 방법으로 입력해야 한다. == 으로 비교하면 안된다.
        if (str1 == str2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // 다음과 같이 str1 가리키는 결과값과 str2가 가리키는 결과값이 같은지를 물어봐야 같은 결과값을 얻을 수 있다.
        if (str1.equals(str2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        String str3 = "APPLE";
        String str4 = "APPLE";
        // 다음과 같이 입력하면 APPLE 의 결과를 같이 공유하는 입장이라 YES

        if (str3 == str4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        if (str3.equals(str4)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
