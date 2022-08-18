package multithreading;

public class InterThreadCommunication {
	int a;
	synchronized void set(int a1)
	{
		System.out.println("setting data"+a);
		this.a=a1;
	}
	synchronized void get()
	{
		System.out.println("getting data"+a);
	}

}
