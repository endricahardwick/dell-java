
public class GarageManager {

	public static void main(String[] args) {
		// Instantiate a few ParkingGarage instances with different capacities.
		// Instantiate a few cars, and proceed to park them and unpark them from the garages.

		//Parking Garage #1
		ParkingGarage parkingGarage1 = new ParkingGarage(4);	
		
		try{parkingGarage1.park(new Car("Red","LC1234","Nissan","Ultima"), 2);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage1.park(new Car("white","LC5678","Honda","Civic"), 3);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage1.park(new Car("Blue","LC9876","Mazda","6"), 1);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage1.park(new Car("Black","LC5432","Nissan","Maxima"), 0);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage1.park(new Car("Grey","LC1020","Toyota","Camry"), 4);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage1.park(new Car("Green","LC3040","Ford","Mustang"), 5);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage1.vacate(2);}
		catch (Exception e) {System.out.println(e);}
		
		parkingGarage1.printInventory();
		
		
		//Parking Garage #2
		ParkingGarage parkingGarage2 = new ParkingGarage(3);	
		
		try{parkingGarage2.park(new Car("Red","LC1234","Nissan","Ultima"), 2);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage2.park(new Car("white","LC5678","Honda","Civic"), 3);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage2.park(new Car("Blue","LC9876","Mazda","6"), 1);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage2.park(new Car("Black","LC5432","Nissan","Maxima"), 1);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage2.vacate(4);}
		catch (Exception e) {System.out.println(e);}
		
		parkingGarage2.printInventory();
		
		
		//Parking Garage #3
		ParkingGarage parkingGarage3 = new ParkingGarage(2);	
		
		try{parkingGarage3.park(new Car("Red","LC1234","Nissan","Ultima"), -1);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage3.park(new Car("white","LC5678","Honda","Civic"), 1);}
		catch (Exception e) {System.out.println(e);}
		
		try{parkingGarage3.vacate(1);}
		catch (Exception e) {System.out.println(e);}
		
		parkingGarage3.printInventory();
	}

}
