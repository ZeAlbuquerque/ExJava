
public class Floor {

	private double length;
	private double width;

	public Floor(double length, double width) {
		super();
		if (length < 0) {
			this.length = 0;
		} else {
			this.length = length;
		}
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public Floor() {
		super();
	}

	public double getArea() {
		return width * length;
	}

}
