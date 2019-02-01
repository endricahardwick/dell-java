
public class ParkingGarage {

//	car array(Car[]) to represent the parking spots.  
//	The "spot number" of each parking spot is its array index (starting with spot 0)
	private Car[] parkingSpots;


//	Constructor empty
	public ParkingGarage() {

	}

//	Constructor initialized
	public ParkingGarage(int numSpots) {
		parkingSpots = new Car[numSpots];

	}

//	gets/sets initiated

	public Car[] getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(Car[] parkingSpots) {
		this.parkingSpots = parkingSpots;
	}



//	Methods

//	Method adds the car to a parking spot.
	public void park(Car car, int spot) {

//					If the user attempts to add the car to a spot that doesn't exist (outside the array), 
//					catch the exception and notify the user.

		if (spot < 0 || spot > parkingSpots.length)
			throw new IllegalArgumentException(spot + " is an invalid parking spot.");

		
//					If there's already a car parked in the spot, notify the user 
//					that the car cannot be parked in that spot.

		if (parkingSpots[spot] != null)
			throw new IllegalArgumentException(spot + " is occupied.");
			System.out.println();

		parkingSpots[spot] = car;

	}

	
// Method removes the car from the specified spot.
	public void vacate(int spot) {

// 					If the user attempts to remove a car from an empty spot,
// 					notify the user that no car is present in that spot.

		if (parkingSpots[spot] == null)
			throw new IllegalArgumentException("Spot is empty.");

		parkingSpots[spot] = null;
	}

	
//	Method, that prints out to the console the the listing of all the cars 
//	with a brief description.
	public void printInventory() {

//		The spot number (array index) of the car in the parking garage
//		The car's color, license #, make, and model

		System.out.println();
		System.out.println("Number of Parking Spaces: " + parkingSpots.length);

		for (int i = 0; i < parkingSpots.length; i++) {
			System.out.println("Slot " + i);
			
			if (parkingSpots[i] !=null) {
				System.out.println(parkingSpots[i].print());
			}
			System.out.println();
		}

	}

}
