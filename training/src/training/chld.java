package training;

public class chld extends prnt
{
	public chld()
	{
		this(2,1);
		System.out.println("This is default child constructor");
	}
	public chld(int a)
	{
		this();
		System.out.println("This is one parameterized child constructor");
	}
	public chld(int a, int b)
	{
		super(1,2);
		System.out.println("This is two parameterized child constructor");
	}
	public chld(int a, int b, int c)
	{
		this(1);
		System.out.println("This is three parameterized child constructor");
	}
	public static void main(String[] args) 
	{
		chld C = new chld(1,2,3);
		
	}
}
