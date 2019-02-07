
public class CarLotProgram {

	public static void main(String[] args) {
		
//		Instantiate 2 different car lots
//		add various vehicles to the car lots.
//		Print out the inventory for each of the car lots, showing the details for each vehicle.
//		Print the appropriate info for a car, or a truck accordingly

		
//		Car lot #1 named New Cars
		CarLot carLot1 = new CarLot("NEW");
		
//		Add vehicles to the New Car lot
		carLot1.addVehicle(new Truck("Small bed","LC1234","Toyota","Tundra","$10,000"));
		carLot1.addVehicle(new Car("LC1234","Toyota","Camry","$10,000",Car.typeOptions[2],"2 door"));
		
		carLot1.printInventory();
		
//		Car lot #2 named Used Cars
		CarLot carLot2 = new CarLot("USED");
//		
////		Add vehicles to the Used Car lot
		carLot2.addVehicle(new Truck("Medium bed","LC1020","Ford","King Ranch","$37,000"));
		carLot2.addVehicle(new Car("LC3040","Ford","Mustang","$10,000",Car.typeOptions[0],"2 door"));

		carLot2.printInventory();
		
	}

}
