package _01_Encapsulate_the_Data;

public class EncapsulateTheData {

	// 1. Encapsulate all the members.

	// 2. Implement the setter restrictions described above each member variable.

	// 3. Pass all the JUnit tests.

	/* 
	 * All negative arguments should set itemsReceived to 0.
	 */

	private int itemsReceived;
	
	public void setItemsReceived(int itemsRecieved) {
		if(itemsRecieved>0) {
			this.itemsReceived=itemsRecieved;
		}
		else {
			this.itemsReceived = 0;
		}
	}
	
	public int getItemsRecieved() {
		return itemsReceived;
	}
	/*
	 * degreesTurned must be locked between 0.0 and 360.0 inclusive.
	 * 
	 * All parameters outside this range should set degreesTurned to the nearest
	 * bound.
	 */
	private double degreesTurned;

	public void setDegreesTurned(double degreesTurned) {
		if(degreesTurned < 0) {
			degreesTurned = 0;
		}
		if(degreesTurned > 360) {
			degreesTurned = 360;
			
		}
		else {
			this.degreesTurned = degreesTurned;
		}
	}
	public double getDegreesTurned() {
		return degreesTurned;
		
	}

	/*
	 * nomenclature must not contain an empty String.
	 * 
	 * An empty String parameter should set nomenclature to a String with a single
	 * space.
	 */

	private String nomenclature;
	public void setNomenclature(String nomenclature) {
		if(!(nomenclature.isEmpty())) {
			this.nomenclature = nomenclature;
		}
		else {
			this.nomenclature = " ";
		}
	}
	
	public String getNomenclature() {
		return nomenclature;
	}

	/*
	 * memberObj must not be a String.
	 * 
	 * A String parameter should set memberObj to a new Object();
	 * 
	 * Hint: Use the instanceof operator.
	 * 
	 * Example:
	 * 
	 * Robot rob = new Robot();
	 * 
	 * System.out.println(rob instanceof Robot); // prints true
	 * 
	 * System.out.println(rob instanceof Random); //prints false
	 */

	private Object memberObj;
	
	public void setMemberObj(Object memberObj) {
		if (! (memberObj instanceof String)) {
			this.memberObj = memberObj;
		} else {
			this.memberObj = new Object();
		}
	}
	public Object getMemberObj() {
		return memberObj;
	}

}
