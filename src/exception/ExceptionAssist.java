package exception;

public class ExceptionAssist {
    public static void main(String[] args)  {
        Account account = new Account(10000);

        try {
            System.out.println("잔액 = "+account.withdraw(5000));
        } catch (OverdraftException e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("잔액 = "+account.withdraw(35000));
        } catch (OverdraftException e) {
            throw new RuntimeException(e);
        }
    }
}
