
public class Ex32_Test {

public static void main(String[] args) {
	Ex32_Point first = new Ex32_Point(6, 5);
	Ex32_Point second = new Ex32_Point(3, 1);
	System.out.println("distance(0,0)= " + first.distance());
	System.out.println("distance(second)= " + first.distance(second));
	System.out.println("distance(2,2)= " + first.distance(2, 2));
	Ex32_Point Ex32_Point = new Ex32_Point();
	System.out.println("distance()= " + Ex32_Point.distance());	
}
}
