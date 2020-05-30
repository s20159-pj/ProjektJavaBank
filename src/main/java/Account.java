public class Account extends User {

    int accountNr = 987654321;
    double balance = 1987.44;

    public Account(String name, int userId, int accountNr, double balance) {
        super(name, userId);
        this.accountNr = accountNr;
        this.balance = balance;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
