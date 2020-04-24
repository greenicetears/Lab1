package mypackage;

public class Nationality {
	
	private String country;
	
	public Nationality(String c){
		this.country = c;
	}
	
	public void setCountry(String c) {
		this.country = c;
	}
	public String getCountry(){
		return this.country;
	}
	public String toString() {
		return this.country;
	}
}
