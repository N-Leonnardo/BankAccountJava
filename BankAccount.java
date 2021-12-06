import java.util.ArrayList;

public class BankAccount{
    public double checkingBalance = 0;
    public double savingsBalance = 0;
    public static int numberOfaccounts = 0;
    private static int totalAmount = 0;

    public BankAccount(){
        numberOfaccounts++;
    }

    public String getCheckingBalance(){
        return "Your check balance is: " + checkingBalance;
    }

    public String getSavingsBalance(){
        return "Your check savings is: " + savingsBalance;
    }
    public void addChecking(int amountParam){
        this.checkingBalance += amountParam;
    }

    public void addSavings(int amountParam){
        this.savingsBalance += amountParam;
    }

    public void withdrawChecking(int amountParam){
        if(amountParam<= checkingBalance){
        this.checkingBalance -= amountParam;
        }
    }

    public void withdrawSavings(int amountParam){
        if(amountParam<= savingsBalance){
        this.savingsBalance -= amountParam;
        }
    }

    public String showAmount(){
        return "Your total amount is: "+ totalAmount;
    }

    
}
