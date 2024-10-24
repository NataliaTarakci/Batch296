package practices.practice05.F02_LoanManagement;

public class Runner_Loan {

    //HOMEWORK

    //Take and repay loans for both personal and business
    // updated loan balance
    public static void main(String[] args) {

        PersonalLoanAccount personalLoanAccount = new PersonalLoanAccount("P1", 1000.0);
        personalLoanAccount.deposit(500.0);//Deposited £500.0 into Personal Loan Account.
        personalLoanAccount.showBalance();//Account Number :P1, Balance: £1500.0
        personalLoanAccount.takeLoan(5000.0);//Took a loan £5000.0 . Loan Balance: £5000.0
        personalLoanAccount.showLoanBalance();//Current Loan Balance: £5000.0
        personalLoanAccount.payLoan(1000.0);//Paid £1000.0 towards the loan. Remaining Loan Balance: £4000.0
        personalLoanAccount.showLoanBalance();//Current Loan Balance: £4000.0

        System.out.println("=====================");

        BusinessLoanAccount businessLoanAccount = new BusinessLoanAccount("B1", 100000.0);
        businessLoanAccount.deposit(5000.0);//Deposited £5000.0 into Business Loan Account
        businessLoanAccount.showBalance();//Account Number :B1, Balance: £105000.0
        businessLoanAccount.takeLoan(50000.0);//Took a loan £50000.0 . Business Loan Balance: £50000.0
        businessLoanAccount.showLoanBalance();//Current Business Loan Balance: £50000.0
        businessLoanAccount.payLoan(10000.0);//Paid £10000.0 towards the loan. Remaining Business Loan Balance: £40000.0
        businessLoanAccount.showLoanBalance();//Current Business Loan Balance: £40000.0
    }
}
