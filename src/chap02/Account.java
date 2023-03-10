package chap02;

public class Account {
    private int balance;  // 인스턴스가 1개이므로 값 유지

    public Account(int amount) {
        this.balance = amount;
    }

    public int getBalance() {
        return this.balance;
    }

    public int deposit(int amount){
        this.balance = this.balance + amount;
        return this.balance;
    }
    public void withdraw(int withdrawAmount) {
        if (this.balance < withdrawAmount) {
            System.out.println("잔액 부족");

        } else {
            this.balance -= withdrawAmount;
        }
//        System.out.println("현재 잔액 :"+ balance);
    }
}
