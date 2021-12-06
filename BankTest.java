public class BankTest{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        account1.addChecking(20);
        System.out.println(account1.getCheckingBalance());
    }
}