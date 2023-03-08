package exception;

public class Account {
    private static int currentAmount = 0;

    public Account(int deposit) {
        this.currentAmount += deposit;
    }

    public int withdraw(int withdrawAmount) throws OverdraftException {
        if (currentAmount < withdrawAmount) {
            throw new OverdraftException("잔액이 부족합니다.");
        }

        currentAmount -= withdrawAmount;

        return currentAmount;
    }
}
