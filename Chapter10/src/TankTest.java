
public class TankTest {

	public static void main(String[] args) {
		Tank waterTank = new Tank();
		try {
			waterTank.fillTank(19);
			waterTank.fillTank(2);
		} catch (TankIsFullException e) {
			System.out.println("Tank is full");
		}

	}

}
