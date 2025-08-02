public interface IAccount {
    void deposit(double amount);
    void withdraw(double amount);
    String getName();
    double getBalance();
    void getAccountDetails();
}
