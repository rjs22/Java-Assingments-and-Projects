
public class CheckingAccount extends BankAccount{
	private int transactionCount;
	
	public CheckingAccount(){
		super();
		transactionCount = 0;
	}
	
	public CheckingAccount(double amt){
		super(amt);
		transactionCount = 0;
	}
	
	@Override
	public void deposit(double amt){
		transactionCount++;
		super.deposit(amt);
		deductFees();
	}
	
	@Override
	public void withdraw(double amt){
		transactionCount++;
		super.withdraw(amt);
		deductFees();
	}
	
	public void deductFees(){
		if(transactionCount > 3){
			super.withdraw(2);
			transactionCount = 0;
		}
	}

}
