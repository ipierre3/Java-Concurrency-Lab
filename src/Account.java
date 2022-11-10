public class Account {

    private int balance;
    private int amountWithdrawn;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void setAmountWithdrawn(int amountWithdrawn) {
        this.amountWithdrawn = amountWithdrawn;
    }

    public Account(int balance) {
        this.balance = balance;
    }
    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            this.amountWithdrawn += amount;
            System.out.println(amount + " withdrawn. New balance " + this.balance + ". Total withdrawn: " + this.amountWithdrawn);
        } else {
            System.out.println("Insufficient funds. Total withdrawn: " + this.amountWithdrawn);
        }
    }
}
