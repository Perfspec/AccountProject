
public class Account {
	protected String firstName;
	protected String lastName;
	protected String accountNumber;
	
	public Account(String first, String last, String accNum) {
		firstName = first;
		lastName = last;
		accountNumber = accNum;
	}
	
	public String getF() {
		return firstName;
	}
	
	public String getL() {
		return lastName;
	}
	
	public String getAccNum() {
		return accountNumber;
	}
		
	public void setF(String a) {
		firstName = a;
	}
	
	public void setL(String a) {
		lastName = a;
	}
	
	public void setAccNum(String a) {
		accountNumber = a;
	}

}
