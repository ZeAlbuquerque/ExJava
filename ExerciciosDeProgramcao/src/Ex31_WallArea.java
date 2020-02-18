
public class Ex31_WallArea {

	private double width;
	private double height;

	public Ex31_WallArea() {
	}

	public Ex31_WallArea(double width, double height) {
		super();

		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}

		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}
	}

	public double getArea() {
		return height * width;
	}

}
