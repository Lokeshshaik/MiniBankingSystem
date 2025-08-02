
public class Bank extends AbstractBank{
    public void createAccount(){
        while(true){
            try{
                String name = InputUtil.readString("Enter user name : ");
                String pass = InputUtil.readString("Set password: ");
                double deposit = InputUtil.readDouble("Initial Deposit: ₹");

                IAccount acc =  new Account(name, counter++, pass, deposit);
                accounts.put(((Account) acc).getAccountNumber(), acc);
                System.out.println("✅ Account created successfully!");
                break;
            }
            catch(InvalidInputException e){
                System.out.println("❌ Error: " + e.getMessage());
            }
            catch(Exception e){
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }
    }

}
