package nestedclass2;

public class Nestedclass2 {


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        
        bankAccount.calculateInterest(5);
        System.out.println(bankAccount.getAccountBalance());
       
    }
    
}

class BankAccount
{   

    public BankAccount(double accountBalance) 
    {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() 
    {
        return accountBalance;
    }
    
    public void calculateInterest(double interestRate)
    {
        Interest interest= new Interest(interestRate);
        interest.changeAccountBalance();
    
    }
    
        
    private double accountBalance;
    
    class Interest
    {        
        public Interest(double interestRate) 
        {
            this.interestRate = interestRate;
        }
        public double getInterestRate() 
        {
            return interestRate;
        }
        public void changeAccountBalance()
        {   double interest = (accountBalance* interestRate)/100;
            accountBalance += interest;
        }
        private double interestRate;
    }
    


}


