
public class SavingsAccount extends BankAccount
{
	
	/* Definition of an instance variable called rate 
	 * that represents the annual interest rate. 
	 * Set it equal to 2.5%.  
	*/
	private double rate = 2.5;
	
	
	// Definition of an instance variable called savingsNumber, initialized to 0
	private int savingsNumber = 0;
	
	// Definition of accountNumber String variable 
	private String accountNumber;
	
	
	/*
	 * Definition of  a constructor that takes a name 
	 * and an initial balance as parameters 
	 * and calls the constructor for the superclass
	 */
	public SavingsAccount(String ownerName, double initialAmount)
	{
		// Call the constructor of father clas
		super(ownerName, initialAmount);
		
		
		/*
		 * Initialize accountNumber to be the current value 
		 * in the superclass accountNumber (the hidden instance variable)
		 * concatenated with a hyphen and then the savingsNumber.
		 */
		accountNumber = super.getAccountNumber()+"-" + savingsNumber;
	}
	

	
	/*
	 * Definition of postInterest method that calculate 
	 * one month's worth of interest on the balance and deposit it into the account
	 */
	public void postInterest()
	{
		double interest = getBalance() * rate / 100 / 12;
		deposit(interest);
	}
	
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	
	// Definition of a copy constructor that creates another savings account for the same person
	public SavingsAccount(SavingsAccount oldAccount, double initialAmount)
	{
		// call the copy constructor of the superclass
		super(oldAccount, initialAmount);
		
		/* assign the savingsNumber to be one more than 
		 * the savingsNumber of the original savings account. 
		 * It assign the accountNumber to be the accountNumber of the superclass concatenated 
		 * with the hyphen and the savingsNumber of the new account
		*/
		savingsNumber++;
		accountNumber = super.getAccountNumber()+"-" + savingsNumber;
	}
	
}





