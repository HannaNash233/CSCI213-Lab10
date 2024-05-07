/**
* Car.java
* @author Hanna Nash
* 
*/
public class Car extends Vehicle{
	private int numDoors; 
	private int numPassengers;
	
	public Car(String aMake, String aModel, String aPlate, int aDoor, int aPassenger){
		super(aMake, aModel, aPlate);
		this.numDoors = aDoor;
		this.numPassengers = aPassenger;
	}
	
	public int getDoors(){
		return this.numDoors;
	}
	
	public int getPassengers(){
		return this.numPassengers;
	}
	
	public String toString(){
		String result = "";
		result = String.format("%d-door %s %s with license %s", this.getDoors(), this.getMake(), this.getModel(), this.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Car)){
			return false; 
		}
		Car other = (Car) obj;
		if(this.numDoors == other.getDoors()){
			if(this.numPassengers == other.getPassengers()){
				return super.equals(other);
			}
		}
		return false;
	}
	
	
	public Car copy(){
		String theMake = this.getMake();
		String theModel = this.getModel();
		String thePlate = this.getPlate();
		int theDoors = this.getDoors();
		int thePassengers = this.getPassengers();
		
		Car theCopy = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return theCopy;
	}
	
}