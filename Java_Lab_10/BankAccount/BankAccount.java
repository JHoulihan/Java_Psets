public class BankAccount {
    
    private String name;
    private double balance;
    private int accountID;
    private static int id = 100000;

    public BankAccount(){
        name = "";
        balance = 0;
        accountID = id;
    }

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
        id++; 
        this.accountID = id;
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double balance){
        balance = this.balance;
    }

    public int getAccountID(){
        return this.accountID;
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdrawal(double minus){
        if(this.balance >= minus){
            this.balance -= minus;
        } else{
            System.out.println("Insufficient funds");
        }
    } 

    public void print(){
        System.out.println("******************");
        System.out.println("Name: "+this.name);
        System.out.println("Balance "+this.balance);
        System.out.println("Account ID: "+this.accountID);
        System.out.println("******************");
    }

}
