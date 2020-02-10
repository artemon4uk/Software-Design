public class rectangle extends shape {
	
	protected double height;
	protected double width;
	
	
	public rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
}
