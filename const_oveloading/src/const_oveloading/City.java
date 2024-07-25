package const_oveloading;

public class City extends State {
	
	private String city;
	
	public City()
	{
		super();
		this.city = "Ahmedabad";
	}

	
	
	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "City [city=" + city + "]";
	}
	
	

}
