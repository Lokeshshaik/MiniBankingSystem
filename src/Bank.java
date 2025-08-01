import java.util.*;

public class Bank {
    Map<Integer,Account> accounts = new HashMap<>();
    public static int counter = 1001;

    public void createAccount(){

        System.out.println("\n=== Account Creation ===");

        String name;
        while(true){
            name = InputUtil.readString("Enter name : ");
            if(!name.trim().isEmpty()){
                break;
            }
            System.out.println("Empty name should not be allowed");
        }

        String pass;
        while(true){
            pass = InputUtil.readString("Enter password : ");
            if(!pass.trim().isEmpty()){
                break;
            }
            System.out.println("Password cannot be empty");
        }

        double deposit;
        while(true){
            deposit = InputUtil.readPositiveDouble("Enter money to initial depsoit");
            break;
        }
        int accNum = counter++;
        Account acc = new Account(name,accNum,pass,deposit);
        accounts.put(accNum,acc);
        System.out.println("✅ Account Created! Your Account Number: " + accNum);
    }
    public Account login(int accNum, String password){
        Account acc = accounts.get(accNum);
        if(acc!=null && acc.verifyPassword(password)){
            return acc;
        }
        return null;
    }
    public boolean hasAccount(int accNum){
        return accounts.containsKey(accNum);
    }
}
