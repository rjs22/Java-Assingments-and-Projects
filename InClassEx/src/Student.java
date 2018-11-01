
public class Student {
	private String name;
	private String city;
	private Profile profile;

	
	/**
	 * @return the profile
	 */
	public Profile getProfile() {
		return profile;
	}

	public Student (String name, String city, int numCredits, String major, int year){
		this.name = name;
		this.city = city;
		this.profile = new Profile(numCredits, major, year);
	}

	public boolean equals(Student obj){
		int myCredits = profile.getCredits();
		Profile theirProfile = obj.getProfile();
		int theirCredits = theirProfile.getCredits();
		if(name.equals(obj.name) && city.equals(obj.city) && myCredits == theirCredits)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + city + ", profile="
				+ profile + "]";
	}
}