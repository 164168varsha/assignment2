package collectionFramework;

public class BankAccountList implements Comparable<SavingBankAccount>{

	public BankAccountList(String accountHolderName, double accountBalance) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {	
		SavingBankAccount saving=new SavingBankAccount("abc", 50000, true);
		SavingBankAccount saving1=new SavingBankAccount("def", 60000, true);
		SavingBankAccount saving2=new SavingBankAccount("xyz", 70000, false);
		saving.withdraw(2000);
		
	}

			

		
	@Override
	public int compareTo(SavingBankAccount arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
