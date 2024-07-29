package Abstract;

public class CurrentAccount extends BankAccount {
	
	private String cname;
	private int acc_no,ifcs;
	private int balance;
	
	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getIfcs() {
		return ifcs;
	}

	public void setIfcs(int ifcs) {
		this.ifcs = ifcs;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

	public CurrentAccount(String cname, int acc_no, int ifcs, int balance) {
		super();
		this.cname = cname;
		this.acc_no = acc_no;
		this.ifcs = ifcs;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CurrentAccount [cname=" + cname + ", acc_no=" + acc_no + ", ifcs=" + ifcs + ", balance=" + balance
				+ "]";
	}

	public void deposit(int d_amount) {
		int bal = balance + d_amount;
		System.out.println("Balance : "+bal);
	}
	
	public void withdraw(int w_amount) {
		int bal = balance - w_amount;
		System.out.println("Balance :"+bal);
	}
}
