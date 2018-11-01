
public class TankIsFullException extends Exception
{
	public TankIsFullException()
	{
		super("TankIsFullException error");
	}
	public TankIsFullException(String s)
	{
		super(s);
	}
}
