package Com.Spring;

public class Student
{
	
	private String LastName;
	private String FirstName;
	private String Address;
	private String City;
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [LastName=" + LastName + ", FirstName=" + FirstName + ", Address=" + Address + ", City=" + City
				+ "]";
	}
	
	
}
