package greatlearning.com.main.problem1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Driver {

	public int numberOfFloors, index, floorNumber;
	static int i;

	 LinkedList<Floor> floor_list = new LinkedList<Floor>();

	static Scanner sc = new Scanner(System.in);
	PrintValues pv = new PrintValues();
	
	public void insertValue() { 
		// Get the total no of floors
		do {
		System.out.println("Enter the total no of floors in the building");
		numberOfFloors = sc.nextInt();
		// Get the value of each floor in the loop 
		if(numberOfFloors > 0) {
		for (i = 0; i < numberOfFloors; i++) {

			Floor floor = new Floor();
			System.out.println("Enter the floor size given on day :  " + (i + 1));
			floorNumber = sc.nextInt();
			if (floorNumber != 0) { 
				// check if inserted value is not 0
				floor.setDay(i + 1);
				floor.setSize(floorNumber);
				floor_list.add(floor);
			} else {
				System.out.println("Invalid value. Enter Again");
				i--;
			}
		}
		}else {
			System.out.println("Please entry valid no of floor.");
		}
		}while(numberOfFloors == 0);
		
		// Sorting list in reverse order
		Collections.sort(floor_list, new FloorNumberComparator());
		// printing output
		pv.printConstructionOrder(floor_list);
	}


	public static void main(String[] args) {
		Driver building = new Driver();
		building.insertValue();
	}

}
