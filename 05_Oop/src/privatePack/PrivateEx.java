package privatePack;

public class PrivateEx {

    //private 필드 선언
    private String 계좌번호;
    private double 계좌잔액;

    //private으로 생성한 변수명을 사용하기 위해서는 getter setter를 사용해야 함
    //setter : 값 저장하기
    //getter : 저장된 값 불러와서 사용하기

    //Alt + Insert


    public String get계좌번호() {
        return 계좌번호;
    }

    public void set계좌번호(String 계좌번호) {
        this.계좌번호 = 계좌번호;
    }

    public double get계좌잔액() {
        return 계좌잔액;
    }

    public void set계좌잔액(double 계좌잔액) {
        this.계좌잔액 = 계좌잔액;
    }
}
