abstract class Shape {

	/*
	 * public int shapeId;
	 * 
	 * Shape(int shapeId){ this.shapeId = shapeId; }
	 */
	public abstract void draw();

	public double getArea() {
		return 0.0;
	}
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle ... 10,10");
	}

	public double getArea() {
		return 10.10 * 10.10;// length*width
	}
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle ... 10,10");
	}

	public double getArea() {
		return 1.0 * 2.0;// length*width
	}
}

class Square extends Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Square ... 10,10");
	}

	public double getArea() {
		return 1.0 * 2.0;// length*width
	}
}

public class AbstractionUsingAbstractClassDemo {

	public static void main(String[] args) {
		
		//Shape shape1 = new Shape();
		Shape circle = new Circle();
		circle.draw();
		System.out.println("Area for circle -- " + circle.getArea());

		Shape rectangle = new Rectangle();
		rectangle.draw();
		System.out.println("Area for rectangle -- " + rectangle.getArea());

		Shape square = new Square();
		square.draw();
		System.out.println("Area for square -- " + square.getArea());
		
		System.out.println(square instanceof Square);//true
		System.out.println(square instanceof Shape);//true
		System.out.println(square instanceof Circle);//true
	}
}
