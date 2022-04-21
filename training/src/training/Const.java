package training;

public class Const 
{
	public Const()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public Const(int a)
	{
		this(1,2,3,4);
		System.out.println("One parameterized constructor");
	}
	public Const(int b, int c)
	{
		this();
		System.out.println("Two Parameterized const");
	}
	public Const(int x, int y, int z)
	{
		System.out.println("Three parameterized const");
	}
	public Const(int x1, int y1, int z1, int p)
	{
		this(1,2);
		System.out.println("four parameterized const");
	}
	public static void main(String[] args) 
	{
		new Const(1);	
	}
}
