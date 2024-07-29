package Abstract;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount sa = new SavingAccount("Daksh",15,5566,1000);
		System.out.println(sa);
		sa.deposit(50);
		sa.withdraw(30);
		
		CurrentAccount ca = new CurrentAccount("Neel",23,4543,2000);
		System.out.println(ca);
		ca.deposit(100);
		ca.withdraw(70);
	}

}
