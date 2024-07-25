package contructorforEaxample;

public class Address {
	
	String societyName, Area;
	int pincode;
	
//	public Address(String societyName, String area, int pincode) {
//		this.societyName = societyName;
//		this.Area = area;
//		this.pincode = pincode;
//	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [societyName=" + societyName + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
	
	
	
	
	
}
