package java_230104;

public class Account {
	
	private long balance;
	
	public Account() {
		
	}
	public long getBalance() {
		return balance;
		
		
	}
	void deposit(int money) {
		balance += money;
		
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 : "+ (money - balance )+ "부족함");
		}
		balance -= money;
		
	}


}
