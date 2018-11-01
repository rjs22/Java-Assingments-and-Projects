/* Date: 3/14/16
 * Purpose: Chapter 9, inheritance in-class exercise example designed to give students more experience with creating classes
 * that build off of another class using inheritance key terms and concepts. Point will be the parent of Circle.  Circle will be the parent
 * of Cylinder.
 */
public class Point {
	protected int x;
	protected int y;
	
	public void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void print(){
		System.out.println("The coordinates are x:" + x + " and y: " + y);
	}
}

