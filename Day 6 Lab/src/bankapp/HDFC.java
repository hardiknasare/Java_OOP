package bankapp;

public class HDFC implements Bank {
	public static final double MIN_BALANCE;

	static {
		MIN_BALANCE=5000;
	}
	

	@Override
	public boolean createAccount(int acctNo, String name, double initBalance) {
		if(initBalance > MIN_BALANCE)
		{
			System.out.println("Welcome! Account created successfully in HDFC ");
			return true;
		}
		else
		System.out.println("Insufficient opening balance!");
		System.out.println();
		return false;
	}

	@Override
	public void withdraw(int acctNo, double amt) {
		System.out.println("Withdrawing from HDFC account");
		System.out.println();
	}
	
	public void payBills() {
		System.out.println("Pay Bills using HDFC account");
		System.out.println();
	}
}


