
public class Ex32_Point {

	private int x;
	private int y;

	public Ex32_Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Ex32_Point() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distance () {
		return distance(0,0);
	}

	public double distance (int x, int y) {
		return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
	}
	
	public double distance(Ex32_Point another){
        return distance(another.x, another.y);
    }

}
