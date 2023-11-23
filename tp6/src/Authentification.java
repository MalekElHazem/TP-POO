import java.io.IOException;
import java.util.Scanner;
public class Authentification {
    final String LoginCorrect = "scott";
    final String PwdCorrect = "tiger";
    public static class WrongLoginException extends Exception {
        public WrongLoginException (String msg){
            super(msg);
        }
    }
    public static class WrongPwdException extends Exception {
        public WrongPwdException (String msg){
            super(msg);
        }
    }
    public static class WrongInputLength extends Exception {
        public WrongInputLength (String msg){
            super(msg);
            System.exit(0);
        }
    }

    public String getUserLogin() throws WrongLoginException, WrongInputLength {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user");
        String log = sc.nextLine();
        if (log.length() > 10){
            throw new WrongInputLength("input length wrong");
        }
        if (!log.equals(this.LoginCorrect)){
            throw new WrongLoginException("login input wrong");
        }
        return log;
    }

    public String getUserPwd() throws WrongPwdException, WrongInputLength {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pwd");
        String pwd = sc.nextLine();
        if (pwd.length() > 10){
            throw new WrongInputLength("input length wrong");
        }
        if (!pwd.equals(this.PwdCorrect)){
            throw new WrongPwdException("password input wrong");
        }
        return pwd;
    }
    Authentification() throws WrongLoginException, WrongInputLength, WrongPwdException {
        String Login = this.getUserLogin();
        String Pwd = this.getUserPwd();
    }

    public static void main(String[] args) {
        boolean d = true;
        do {
            d = true;
            try {
                Authentification a = new Authentification();
            } catch (WrongInputLength e) {
                System.out.println(e.getMessage());
                System.exit(0);
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                d = false;
            } catch (WrongPwdException e) {
                System.out.println(e.getMessage());
                d = false;
            } finally {
                System.out.println("fin");
            }
        }while (!d);
    }
}
