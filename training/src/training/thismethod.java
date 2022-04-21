package training;

public class thismethod 
{	
	public void dfault()
	{
		this.three();
		System.out.println("this is default method");
		this.one();
		this.two();
		this.four();
	}
	public void one() 
	{
		System.out.println("this is one parameterized");
	}
	public void two() 
	{
		System.out.println("this is two parameterized");
	}
	public void three() 
	{
		System.out.println("this is three parameterized");
	}
	public void four() 
	{
		System.out.println("this is four parameterized");
	}
	public static void main(String[] args) 
	{
		thismethod obj= new thismethod();
		obj.dfault();
	}
}
