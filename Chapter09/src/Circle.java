public class Circle extends Point {
	
	protected int radius;
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("The radius is: " + radius);
	}
	
	public double area(){
		return Math.PI * radius * radius;
	}
}