public class Account implements IAccount {

    private final String name;
    private final int accountNumber;
    private final String password;
    private double balance;

    public Account(String name, int accNum, String pass, double balance) {
        if(name == null || name.trim().isEmpty()){
            throw new InvalidInputException("Name cannot be empty");
        }
        if(pass == null || pass.trim().isEmpty()){
            throw new InvalidInputException("Password cannot be empty");
        }
        if(balance <=0 ){
            throw new InvalidInputException("Initial deposit must be greater than 0");
        }
        this.name = name;
        accountNumber = accNum;
        password = pass;
        this.balance = balance;
    }
    public boolean verifyPassword(String Inputpassword){
        return this.password.equals(Inputpassword);
    }
    @Override
    public void deposit(double amt){
        if(amt <=0){
            throw new InvalidTransactionException("Depsoit must be greater than 0");
        }
        balance += amt;
    }
    @Override
    public void withdraw(double amt){
        if(amt <= 0){
            throw new InvalidTransactionException("Withdraw amount must be greater than 0");
        }else if(amt > balance){
            throw new InvalidTransactionException("Insufficient balance for withdrawal.");
        }
        balance -= amt;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getBalance(){
        return balance;
    }
    @Override
    public void getAccountDetails() {
        System.out.println("\n=== Account Details ===");
        System.out.println("👤 Name: " + name);
        System.out.println("🏦 Account Number: " + accountNumber);
        System.out.println("💰 Balance: ₹" + String.format("%.2f", balance));
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}
