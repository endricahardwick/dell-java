
import java.time.*;

public class DriversLicense {

// Attributes
	public String firstName;
	public String lastName;
	public String dOB;
	public int height;
	public String gender;

//		Constructor
	public DriversLicense() {

	}

//		Get and Sets

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//		Methods

//		Method that returns the full name by concatenating the first name 
//		and the last name attributes.
	public void getFullName() {

		System.out.println();
		System.out.println(firstName + " " + lastName);

	}

	
//  Method that returns the age by based on the DOB attribute.
	public void getAge(String dOB) {

		// splits up the string based on the position of the /.
		// The substrings are placed into an array.
		String[] dateListArray = dOB.split("/");
		int[] convertedDate = new int[dateListArray.length];

		// Loop through date list array
		// convert string to number
		for (int i = 0; i < convertedDate.length; i++) {
			convertedDate[i] = Integer.parseInt(dateListArray[i]);
		}

		LocalDate today = LocalDate.now(); // today's date
		LocalDate birthday = LocalDate.of(convertedDate[0], convertedDate[1], convertedDate[2]); // date of birth

		Period period = Period.between(birthday, today);
		

		int age = period.getYears(); // calculate the period between DOB and today in years
		System.out.println(age);

	}

}
