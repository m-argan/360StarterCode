package helloWorld;

public class UnderAgeException extends Exception
{

	private static final long serialVersionUID = 6339784555326632937L;

	public UnderAgeException()
	{
		super("Parent is too young");
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

}
