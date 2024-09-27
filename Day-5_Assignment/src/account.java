public class account {
    private int id;
    private String accountType;
    private double balance;

    public account(){

    }
    public account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;

    }
    //Getter and Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if(balance>=amount){
            balance -= amount;
            return true;
        }else{
            return false;
        }
    }

    public String getDetails(){
        return ("Account ID: "+id+"\nAccount Type: "+accountType+"\nBalance: "+balance);
    }

}
