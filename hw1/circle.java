public class circle extends shape {
	
	private double radius;
	
	
	public circle (double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
