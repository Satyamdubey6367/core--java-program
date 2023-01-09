class Employee

{
	private String name;
	private int sal;
	public void show()
	{
		System.out.println("Employee Name is:"+name);
		System.out.println("Employee salary is:"+sal);
	}
	       public static void main(String[] args) 
	{
		Employee e= new Employee();
		e.show();
	}
}
