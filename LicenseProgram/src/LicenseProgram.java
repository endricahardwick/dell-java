
public class LicenseProgram {

	public static void main(String[] args) {

// 	create three different instances of a DriversLicense and 
//	print out the full name and age on each license.

		DriversLicense DL1 = new DriversLicense();

		DL1.firstName = "Joe";
		DL1.lastName = "Smith";
		DL1.dOB = "2007/2/14/";
		DL1.height = 6;
		DL1.gender = "Male";
		DL1.getFullName();
		DL1.getAge(DL1.dOB);
		
		DriversLicense DL2 = new DriversLicense();

		DL2.firstName = "Jane";
		DL2.lastName = "Doe";
		DL2.dOB = "1998/1/30";
		DL2.height = 5;
		DL2.gender = "Female";
		DL2.getFullName();
		DL2.getAge(DL2.dOB);
		
		DriversLicense DL3 = new DriversLicense();

		DL3.firstName = "Cookie";
		DL3.lastName = "Doe";
		DL3.dOB = "2012/6/2";
		DL3.height = 4;
		DL3.gender = "Female";
		DL3.getFullName();
		DL3.getAge(DL3.dOB);
	}
}
