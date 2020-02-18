
class Calculator {

	private Floor floor;
	private Carpet carpet;
	
	public double getTotalCost() {
		return carpet.getCost() * floor.getArea();
	}
	 
	
	public Calculator(Floor floor, Carpet carpet) {
		super();
		this.floor = floor;
		this.carpet = carpet;
	}
	
	
}
