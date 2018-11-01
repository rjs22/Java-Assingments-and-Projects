
public class TankIsEmptyException extends Exception
{
	public TankIsEmptyException()
	{
		super("TankIsEmptyException error");
	}
	public TankIsEmptyException(String s)
	{
		super(s);
	}
}