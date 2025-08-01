public class Account {

    private final String name;
    private final int accountNumber;
    private final String password;
    private double balance;

    Account(String name, int accNum, String pass, double balance){
        this.name = name;
        accountNumber = accNum;
        password = pass;
        this.balance = balance;
    }
    public boolean verifyPassword(String Inputpassword){
        return this.password.equals(Inputpassword);
    }
    public void deposit(double amt){
        balance += amt;
    }
    public void withdraw(double amt){
        balance -= amt;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void getAccountDetails() {
        System.out.println("\n=== Account Details ===");
        System.out.println("👤 Name: " + name);
        System.out.println("🏦 Account Number: " + accountNumber);
        System.out.println("💰 Balance: ₹" + String.format("%.2f", balance));
    }
}
