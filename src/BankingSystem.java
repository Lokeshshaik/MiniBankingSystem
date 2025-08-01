
public class BankingSystem {
    private static final String BankName;
    static{
        BankName = "SBI";
    }
    public static void main(String[] args) {
        Bank bank = new Bank();
        while(true){
            System.out.println(".....Welcome to Bank "+BankName+".....");
            System.out.println("1. Create an Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = InputUtil.readInt("Enter valid choice : ");
            switch(choice){
                case 1 ->{
                    bank.createAccount();
                }
                case 2 ->{
                    int accNum = InputUtil.readPositiveInt("Enter account number : ");
                    if(!bank.hasAccount(accNum)){
                        System.out.println("Account not found");
                        break;
                    }
                    String password = InputUtil.readString("Enter password : ");
                    Account acc = bank.login(accNum,password);
                    if(acc!=null){
                        loggedInMenu(acc);
                    }else{
                        System.out.println("❌ Invalid credentials.");
                    }
                }
                case 3 ->{
                    System.out.println("\uD83D\uDC4B Exiting. Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }

    }

    public static void loggedInMenu(Account acc){
        while(true){
            System.out.println("\n👤 Welcome, " + acc.getName());
            System.out.println("1.View Profile");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Logout");
            int choice = InputUtil.readPositiveInt("Enter valid choice : ");
            switch(choice){
                case 1 ->{
                    acc.getAccountDetails();
                }
                case 2 ->{
                    double amt;
                    while(true){
                        amt = InputUtil.readPositiveInt("Enter amount to deposit : ");
                        if(amt > 0){
                            break;
                        }
                        System.out.println("Enter amount greater than 0");
                    }
                    acc.deposit(amt);
                    System.out.println("Money Deposited. \nBalance : ₹"+String.format("%.2f",acc.getBalance()));
                }
                case 3 ->{
                    double amt;
                    while(true){
                        amt = InputUtil.readPositiveInt("Enter amount to Withdraw : ");
                        if(amt > 0 && amt < acc.getBalance()){
                            break;
                        }
                        else if(amt > acc.getBalance()){
                            System.out.println("Insufficient Funds");
                        }
                        else{
                            System.out.println("Enter positive amount");
                        }
                    }
                    acc.withdraw(amt);
                    System.out.println("Withdrawn. \nBalance : ₹"+String.format("%.2f",acc.getBalance()));
                }
                case 4 ->{
                    System.out.println("Logged out");
                    return;
                    // ✅ Use 'return' to exit the method entirely (e.g., after logout or exit).
                    // ❌ 'break' only exits the switch block, not the method — and not valid in arrow-style (->) switch.
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}


