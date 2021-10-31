package poly;

public class Rectangle extends GeometricObject {
    
    // Nitelikler
    private double width;
    private double height;


    // Constructor
    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    // Getters and Setters

    public double getWidht(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

	@Override
	public double findArea() {
		return this.width * this.height;
	}

    @Override
    public double findPerimeter() {
        return 2 * (this.width + this.height);
    }

}
