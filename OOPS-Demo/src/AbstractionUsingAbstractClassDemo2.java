interface Shape_Interface {

	/*
	 * public int shapeId;
	 * 
	 * Shape(int shapeId){ this.shapeId = shapeId; }
	 */
	public abstract void draw();

	double getArea();//java compiler will be added this public abstract in your method defination.
}

class Circle_C implements Shape_Interface {

	@Override
	public void draw() {
		System.out.println("Drawing a circle ... 10,10");
	}

	@Override
	public double getArea() {
		return 10.10 * 10.10;// length*width
	}
}

class Rectangle_R implements Shape_Interface {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle ... 10,10");
	}

	@Override
	public double getArea() {
		return 1.0 * 2.0;// length*width
	}
}

class Square_S implements Shape_Interface  {

	@Override
	public void draw() {
		System.out.println("Drawing a Square ... 10,10");
	}

	@Override
	public double getArea() {
		return 1.0 * 2.0;// length*width
	}
}

public class AbstractionUsingAbstractClassDemo2 {

	public static void main(String[] args) {
		
		//Shape shape1 = new Shape();
		Shape_Interface circle = new Circle_C();
		circle.draw();
		System.out.println("Area for circle -- " + circle.getArea());

		Shape_Interface rectangle = new Rectangle_R();
		rectangle.draw();
		System.out.println("Area for rectangle -- " + rectangle.getArea());

		Shape_Interface square = new Square_S();
		square.draw();
		System.out.println("Area for square -- " + square.getArea());
		
		System.out.println(square instanceof Square_S);//true
		System.out.println(square instanceof Shape_Interface);//true
		System.out.println(square instanceof Circle_C);//true
	}
}
