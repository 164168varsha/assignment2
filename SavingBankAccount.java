package collectionFramework;

public class SavingBankAccount extends BankAccountList{
	private boolean isSalaryAccount;
	//private Object accountBalance;
	public double accountBalance ;

	public SavingBankAccount( String accountHolderName,double accountBalance,boolean issalaryAccount) {
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=issalaryAccount;
		}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
public void withdraw(double amount) {
	// TODO Auto-generated method stub

	 while(accountBalance > 1000){
	    	if(amount<=0 || amount > accountBalance || accountBalance == 1000){
	    		System.out.println("invalid amount");
	    	}else{
	    	this.accountBalance=accountBalance - amount;	
	    	}
	    	System.out.println(accountBalance);
	 
	 }
	 }

public void display() {
	System.out.println("name=" );
	
}	
}
