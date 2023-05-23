public class BalanceService {

    private int balance = 0;

    public void add(int count) {
        count = count - 10;
        balance += count;
    }

    public void withdraw(int count) {
        count = count + 10;
        balance -= count;
    }

    public int getBalance() {
        return balance;
    }
}
