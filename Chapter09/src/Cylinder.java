public class Cylinder extends Circle {
	protected int height;
	
	public void setHeight(int height){
		this.height = height;
	}
	
	@Override
	public void print(){
		super.print();
		System.out.println("Height is: " + height);
	}
	
	@Override
	public double area(){
		return super.area() * height;
	}
	
}
