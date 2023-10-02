package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// area = l * w
		Rectangle rect = new Rectangle();
		rect.setName("Rectangle");
		rect.setHeight(10);
		rect.setWidth(5);
		
		// area = pi * r * r
		Circle circle = new Circle();
		circle.setName("Circle");
		circle.setDiameter(100);

		
		//area = (l * w) / 2
		Triangle triangle = new Triangle();
		triangle.setName("triangle");
		triangle.setHeight(10);
		triangle.setWidth(5);
		
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);
		shapes.add(triangle);
		
		for ( Shape shape : shapes ) {
			System.out.println("The area for shape " + shape.getName() + " is " + shape.calculateArea() + " the perimeter is " + shape.calculatePerimeter());
		}
		
	}

}
