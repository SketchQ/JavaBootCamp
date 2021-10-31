package poly;

public class Circle extends GeometricObject {
    // Nitelikler
    double radius;
    
    // Circle Constructor
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    // getter and Setter
    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Override satırı okunabilinirliği artırır.    
	@Override
	public double findArea() {
		return this.radius * this.radius * Math.PI;
	}

    @Override
    public double findPerimeter() {
        return 2 * this.radius * Math.PI;
    }
}
