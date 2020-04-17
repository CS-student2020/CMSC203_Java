public class CheckingAccount extends BankAccount 
{
	// Definition of constant FEE that is the cost of clearing one check
	private static final double FEE = 0.15;
	
	// Definition of accountNumber String variable 
	private String accountNumber; 
	
	
	/* Definition of a constructor that takes a name 
	 * and an initial amount as parameters
	*/
	public CheckingAccount(String name, double initialAmount)
	{
		// Call the constructor of father class
		super(name, initialAmount);
		
		// Add -10 at the end of main accountNumber
		accountNumber = super.getAccountNumber()+"-10";	
	}
	
	
	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber +"-10";
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	
	/* Create withdraw method that should take the amount to withdraw, 
	* add to it the fee for check clearing, 
	* and call the withdraw method from the superclass
	*/
	public boolean withdraw(double amount)
	{
		
		return super.withdraw(amount + FEE);
	}
}