package Task4_5;

public interface iUser {
    final String ilogin = "admin";
    final String ipassword = "admin";



    static boolean tryLogin(String login, String password){
        if (ilogin.equals(login)&&ipassword.equals(password)){
        return true;
        }
        else return false;
    }

}
