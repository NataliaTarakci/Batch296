package practices.practice05.F02_LoanManagement;

import practices.practice05.F01_AccountManagement.BankAccount;

public class BusinessLoanAccount extends BankAccount implements LoanAccount {

    //HOMEWORK
    private double loanBalance;

    public BusinessLoanAccount(String accountNumber, double balance){
        super(accountNumber, balance);
        this.loanBalance=0;
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposited £" + amount + " into Business Loan Account.");
    }

    @Override
    public void takeLoan(double amount) {
        loanBalance+=amount;
        System.out.println("Took a loan £" + amount + " . Business Loan Balance: £" + loanBalance);
    }

    @Override
    public void payLoan(double amount) {
        if (amount<= loanBalance){
            loanBalance-=amount;
            System.out.println("Paid £" + amount + " towards the loan. Remaining Business Loan Balance: £" + loanBalance);
        }else {
            System.out.println("Amount exceed the loan balance.");
        }

    }
    public void showLoanBalance(){
        System.out.println("Current Business Loan Balance: £" + loanBalance);
    }
}
