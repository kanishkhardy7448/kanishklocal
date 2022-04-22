package training;

public class prnt
{
	public prnt() 
	{
		this(1,1,2);
		System.out.println("This is default Parent Constructor");
	}
	public prnt(int a) 
	{
		this();
		System.out.println("This is one parameterized Parent Constructor");
	}
	public prnt(int a, int b) 
	{
		this(1);
		System.out.println("This is two parameterized Parent Constructor");
	}
	public prnt(int a, int b, int c) 
	{
		System.out.println("This is three parameterized Parent Constructor");
	}
}
