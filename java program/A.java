class A 
{
	public void show()
	{
		System.out.println("class A");
	}
}
 class B extends A
 {
	 public void show()
	 {
		 System.out.println("class B");
	 }
 }
 class checkoverriding

 {
	public static void main(String[] args) 
	{
		A a=new B();
		a.show();
	}
}
