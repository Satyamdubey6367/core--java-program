class Add1
{
	Add(int a,int b)
	{ 
		System.out.println("sum of two numbers:"+(a+b));
	}
}
Add (int a,int b,int c)
{
	System.out.println("sum of three numbers:"+(a+b+c));
}
Add(float a,float b)
{
	System.out.println("sum of two numbers:"+(a+b));
}
class static Poly
{
	public static void main(String[] args) 
	{
		Add a1=new Add(1,3,6);
		Add a2=new Add(1,7);
		Add a3=new Add(2.3f,4.2f);
	}
}
