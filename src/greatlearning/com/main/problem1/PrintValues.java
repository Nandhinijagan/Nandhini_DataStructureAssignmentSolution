package greatlearning.com.main.problem1;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintValues {
	// function to print output
	public void printValues(int current_day, ArrayList<Integer> result) {
		// TODO Auto-generated method stub
		if (result.size() > 0) {
			System.out.println("Day : " + current_day);
			 for(int i: result) {
				 System.out.print(i + " ");
			 }
			 System.out.println("");
		}
	}

	public void printEmptyDays(int obj_day, int current_day) {
		for (int i = current_day + 1; i < obj_day; i++) {
			System.out.println("Day :" + " " + i + "\n");
		}
	}
	
	public void printConstructionOrder(LinkedList<Floor> floor_list) {
		if (floor_list.size() > 0)
		System.out.println("The order of construction is as follows: ");
		buildingConstructionOrder(floor_list);
		floor_list.clear();
	}

	public void buildingConstructionOrder(LinkedList<Floor> floor_list) {		

		int current_day = 0;
		ArrayList<Integer> result = new ArrayList<>();
		for (Floor floor : floor_list) {
			if (floor.day > current_day) {

				if (current_day + 1 > 0) {
					printValues(current_day, result);
					printEmptyDays(floor.day, current_day);
				}
				current_day = floor.getDay();
				result.clear();
			}
			result.add(floor.getSize());
		}
		printValues(current_day, result);
	}
}
