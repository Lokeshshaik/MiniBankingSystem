import java.util.*;

public abstract class AbstractBank {
    protected final Map<Integer,IAccount>  accounts = new HashMap<>();
    protected static int counter = 1001;

    public IAccount login(int accNum, String password){
        IAccount acc = accounts.get(accNum);
        if(acc instanceof Account account){
            if(account.verifyPassword(password)){
                return acc;
            }
        }
        return null;
    }

    public boolean hasAccount(int accNum){
        return accounts.containsKey(accNum);
    }

    public abstract void createAccount();

}
