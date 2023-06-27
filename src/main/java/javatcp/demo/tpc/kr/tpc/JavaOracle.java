package javatcp.demo.tpc.kr.tpc;

public class JavaOracle implements DbConnect {
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("Oracle DB 가 접속됩니다.");
    }
}
