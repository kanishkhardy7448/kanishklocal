package training;

public class Arithmetic
{
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of two numbers is "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z=x-y;
		System.out.println("Subtraction of two numbers is "+z);
		return z;
	}
	public int mult(int n, int m)
	{	
		int mult1=n*m;
		System.out.println("Multiplication is "+mult1);
		return mult1;	
	}
	public void div(int ab, int bc)
	{
		int div1= ab/bc;
		System.out.println("Final result is "+div1);	
	}

	public static void main(String[] args)
	{
		Arithmetic A=new Arithmetic();
		int resultmult=A.mult(10,2);
		int resultsum=A.sum(resultmult,2);
		int resultsub=A.sub(resultsum, 2);
		int resultsub2=A.sub(resultsub,2);
		int resultsum2=A.sum(resultsub2, 2);
		A.div(resultsum2,2);		
	}
}

