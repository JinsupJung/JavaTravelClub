package chap04.exception;

public class Account {
    private int balance;
    public Account(int balance) {
        this.balance = balance;
    }
    public int withdraw(int amount) throws OverdraftException{
        if (amount > balance) {
            throw new OverdraftException("잔액이 부족합니다.");
        }
        balance -= amount;

        return balance;
    }
}
