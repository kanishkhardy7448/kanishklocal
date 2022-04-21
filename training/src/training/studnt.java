package training;

public class studnt
{
	int age, rollNO;
	public void met1()
	{
		System.out.println("Welcome aboard");
	}
	public void met2()
	{
		System.out.println("Automation is quite easy");
	}
	public static void main(String[] args)
	{
		studnt deepak = new studnt();
		deepak.age=12;
		deepak.rollNO=1;
		System.out.println(deepak.age);
		System.out.println(deepak.rollNO);
		deepak.met1();
		deepak.met2();
	}
}

