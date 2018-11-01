
public class CheckingAccountTest {

	public static void main(String[] args) {
		CheckingAccount obj1 = new CheckingAccount();
		obj1.deposit(100);
		obj1.deposit(200);
		obj1.deposit(50);
		obj1.withdraw(50);
		obj1.deposit(100);
		System.out.println("Balance is " + obj1.getBalance());
		
		BankAccount obj2 = new BankAccount(10);
		obj2.deposit(100);
		obj2.deposit(200);
		obj2.deposit(50);
		obj2.withdraw(50);
		obj2.deposit(100);
		System.out.println("Balance is " + obj2.getBalance());

	}

}
