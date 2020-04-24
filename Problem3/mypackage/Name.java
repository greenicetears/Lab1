package mypackage;

public class Name{
	
	private String first_name;
	private String last_name;
	
	public Name(String f, String l) {
		this.first_name = f;
		this.last_name = l;
	}
	public void setName(String f, String l) {
		this.first_name = f;
		this.last_name = l;
	}
	public String getName()
	{
		return first_name + " " + last_name;
	}
	public String toString() {
		return first_name + " " + last_name;
	}
}