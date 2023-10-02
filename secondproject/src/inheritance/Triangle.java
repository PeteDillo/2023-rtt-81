package inheritance;

public class Triangle extends Shape{
	private double height;
	private double width;
	
	public Triangle() {
		super();
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	
	@Override
	public double calculateArea() {
		return (height * width)/ 2;
	}
	
	@Override
	public double calculatePerimeter() {
		return height + height + width ;
	}

}
