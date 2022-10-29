package p1;

public class A extends Thread
{
	public void run()
	{
		int odd[]={1,3,5,7,9};
		for(int i=0;i<5;i++)
		{
			System.out.println(odd[i]);
			try
			{
				sleep(107);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

package p2;

public class B extends Thread
{
	public void run()
	{
		int even[]={2,4,6,8,10};
		for(int i=0;i<5;i++)
		{
			System.out.println(even[i]);
			try
			{
				sleep(145);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

package p3;
import p1.A;
import p2.B;
public class C 
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		a.start();
		b.start();
	}
}


