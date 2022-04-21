package silsub3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius;
	
	public Circle( ) { }
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void incrementRadius() {
		setRadius(radius+1);
	}
}
