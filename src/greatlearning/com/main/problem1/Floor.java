package greatlearning.com.main.problem1;
import java.util.Comparator;

public class Floor {

	 int floorNumber;
	 int day;
	
	
	public Floor() {
		super();
	}

	public int getSize() {
		return floorNumber;
	}
	public void setSize(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
}
	
	// creates the comparator for comparing Floor value
	class FloorNumberComparator implements Comparator<Floor> {
	  
	    // override the compare() method
	    public int compare(Floor f1, Floor f2){
	    	return f2.floorNumber - f1.floorNumber;
	    }
	}

