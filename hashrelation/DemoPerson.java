package classrelationexample.hashrelation;

public class DemoPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address add = new Address();
		add.setFlatno("8");
		add.setSocityname("Pushpnath");
		add.setArea("Ahmedabad");
		add.setPincode(123);
		
		
		Person ps = new Person();
		ps.setAddr(add);
		ps.setPemail("dakshpatel.com");
		ps.setPname("Daksh");
	// injection object of address class to person class 
	
	System.out.println(ps);
	}
	

}
