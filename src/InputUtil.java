import java.util.Scanner;

public class InputUtil {
    public static final Scanner sc = new Scanner(System.in);

    public static String readString(String msg){
        System.out.println(msg);
        return sc.nextLine();
    }

    public static int readInt(String msg){
        while(true){
            try{
                System.out.println(msg);
                return Integer.parseInt(sc.nextLine());
            }
            catch (Exception e){
                System.out.println("❌ Invalid number.");
            }
        }
    }

    public static Double readDouble(String msg){
        while(true){
            try{
                System.out.println(msg);
                return Double.parseDouble(sc.nextLine());
            }
            catch(Exception e){
                System.out.println("❌ Invalid number.");
            }
        }
    }

    public static int readPositiveInt(String msg){
        while(true){
            System.out.println(msg);
            try{
                int val = Integer.parseInt(sc.nextLine());
                if(val>0){
                    return val;
                }
                System.out.println("❌ Enter a number greater than 0.");
            }
            catch(Exception e){
                System.out.println("❌ Invalid number.");
            }
        }
    }

    public static Double readPositiveDouble(String msg){
        while(true){
            System.out.println(msg);
            try{
                Double val = Double.parseDouble(sc.nextLine());
                if(val > 0.0){
                    return val;
                }
                System.out.println("❌ Enter a number greater than 0.");
            }
            catch(Exception e){
                System.out.println("❌ Invalid number.");
            }
        }
    }
}
