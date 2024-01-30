// 4 modifiers
// private
// default
// protected
// public

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Ishwar";
        
        System.out.println(myAcc.username);
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    String username;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
}