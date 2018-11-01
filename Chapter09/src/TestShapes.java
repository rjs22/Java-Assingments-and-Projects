import java.util.ArrayList;


public class TestShapes {

	public static void main(String[] args) {
		Point obj1 = new Point();
		obj1.setPoint(3, 5);
		
		Circle obj2 = new Circle();
		obj2.setPoint(4, 5);
		obj2.setRadius(10);
		
		Cylinder obj3 = new Cylinder();
		obj3.setPoint(6, 2);
		obj3.setRadius(5);
		obj3.setHeight(6);
		
		obj1.print();
		obj2.print();
		obj3.print();
		
		System.out.println("Area of a circle is " + obj2.area());
		System.out.println("Area of a cylinder is " + obj3.area());
		
		Point p = (Point) obj3; //is okay!
		
		Cylinder c = (Cylinder) obj1;
		
		ArrayList<Point> shapes = new ArrayList<Point>();
		
		shapes.add(obj1);//0
		shapes.add(obj2);//1
		shapes.add(obj3);//2 - cylinder

		shapes.get(2).print();
		((Circle) shapes.get(2)).area();
		
		System.out.println("******");
		p.print();
		
		
		
	}

}
