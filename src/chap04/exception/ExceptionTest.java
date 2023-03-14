package chap04.exception;

public class ExceptionTest {
    public static void main(String[] args) {

        Account account = new Account(10000);
        try {
            System.out.println(account.withdraw(15000));
        } catch (OverdraftException e) {
            throw new RuntimeException(e);
        }

    }
}
