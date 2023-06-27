package javatcp.demo.tpc;

public class TPC02 {

    public static void main(String[] args) {
        // 프로그래밍의 3대 요소 : 변수, 자료형(DataType), 할당(=)
        // 1+1=2 라는 프로그램을 만들어야 했을 때 변수라는 기억공간을 사용해서 데이터를 담아 출력하면 된다.

        // int 에 변수 선언
        int a, b, c;
        // 선언한 변수에 값 입력
        a = 1;
        b = 1;
        // 입력된 값 + 값 = 값
        c = a + b;

        // 단순하게 값 + 값 을 하면 시스템이 알아서 할당된 값을 출력해준다(2).
        System.out.println(a+b);
        // 아니면 따로 변수에 할당된 값을 넣어 변수로 출력 가능하다(2).
        System.out.println("int = " + c);

        // 실수형
        float f;
        f = 34.5f;
        System.out.println("float = " + f);

        // 문자형
        char d;
        d = 'A';
        System.out.println("char = " + d);

        // 논리형
        boolean g;
        g = true;
        System.out.println("true = " + g);

        String book;
        book = "책";
        System.out.println("book = " + book);
    }
}
