package multithreading;

public class Ex {
	public static void main(String[] args)
	{
		InterThreadCommunication obj = new InterThreadCommunication();
		Produce p= new Produce(obj);
		consume c = new consume (obj);
		p.start();
		c.start();
		try
		{
			p.join();
			c.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
