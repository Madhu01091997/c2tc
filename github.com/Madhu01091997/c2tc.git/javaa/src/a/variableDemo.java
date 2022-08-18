package a;


public class variableDemo {
	static int a =10;
	static int b;
	static int c = 30;
	int x=10;
	static void func1()
	{
		System.out.println("the Values are ");
		System.out.println("a Value is "+a);
		System.out.println("b Value is "+b);
		System.out.println("c Value is "+c);
		
	}
	static void func2()
	{
		int d =19;
		System.out.println("d Value is "+d);
		System.out.println("c Value is "+c);
		
	}
	
	void func3(){
		System.out.println("x Value is "+x);
	}

		static 
		{
		System.out.println("starting staic block ");
					//System.exit(0);
		}

	public static void main(String[] args) {
	System.out.println("c value is "+variableDemo.c);
	variableDemo obj=new variableDemo();
	obj.func1();
	variableDemo.func2();
	obj.func3();
}


}
