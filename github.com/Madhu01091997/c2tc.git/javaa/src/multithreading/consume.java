package multithreading;

public class consume extends Thread {
	InterThreadCommunication obj;
	public consume (InterThreadCommunication obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			obj.get();
		}
	}

}
