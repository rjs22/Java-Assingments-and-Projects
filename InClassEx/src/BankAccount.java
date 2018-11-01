public class BankAccount
{
	private double balance; //single class attribute	

	public BankAccount() //default constructor
	{
		balance = 0;
	}

	public BankAccount(double balance)  //overloaded constructor
	{
		this.balance = balance;
	}

	public void deposit(double amount)  //adds money to the bank account
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)  //withdraws $$ from bank account
	{
		balance = balance - amount;
	}

	public double getBalance()  //accessor
	{
		return balance;
	}

	//transfers an amount from one account to another
	public void transfer(BankAccount other, double amount) 
	{
		withdraw(amount);
		other.deposit(amount);
	}
}
