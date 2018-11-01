
public class Profile {
	private int credits;
	private String major;
	private int year;
	
	/**
	 * @return the numCredits
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	public Profile(int numCredits, String major, int year ){
		this.credits = numCredits;
		this.major = major;
		this.year = year;
	}
	
	public boolean equals (Profile other){
		if(credits == other.credits && year == other.year && major.equals(other.major))
			return true;
		return false;
	}
	
		@Override
		public String toString() {
			return "Profile [numCredits=" + credits + ", major=" + major
					+ ", enrollYear=" + year + "]";
		}
	}

