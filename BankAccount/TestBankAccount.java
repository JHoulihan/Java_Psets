public class TestBankAccount{
    public static void main(String[] args){

        BankAccount bA1 = new BankAccount("Mary Bloggs", 500);
        BankAccount bA2 = new BankAccount("Joe Spot", 1000);

        System.out.println("Balance is "+bA1.getBalance());

        bA2.print();
        
        bA2.deposit(500);
        bA2.print();
        
        bA1.print();
        
        bA1.withdrawal(600);
        
        bA1.withdrawal(400);
        
        bA1.setName("Mary Bloggs-Spot");
        bA1.print();
    }
}