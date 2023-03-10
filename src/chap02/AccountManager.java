package chap02;

public class AccountManager {
    public static void main(String[] args) {
        Account myAccount = new Account(20000);

        myAccount.withdraw(10000); // 인스턴스 메소드는 객체 생성이휴에 실행해야 된다
        int deposit = myAccount.deposit(5000);

        System.out.println(myAccount.getBalance());
    }
}
