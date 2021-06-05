package bankapp;

public class BankOfBaroda implements Bank {

	public static final double MIN_BALANCE;

	static {
		MIN_BALANCE=1000;
	}
	
	@Override
	public boolean createAccount(int acctNo, String name, double initBalance) {
		if(initBalance > MIN_BALANCE)
		{
			System.out.println("Welcome! Account created successfully in BoB ");
			return true;
			
		}
		System.out.println("Insufficient Opening Bank!");
		return false;
	}

	@Override
	public void withdraw(int acctNo, double amt) {
		System.out.println("Withdrawing from BoB account");
		System.out.println();
	}

}
