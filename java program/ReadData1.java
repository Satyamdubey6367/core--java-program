import java.util.*;
class  ReadData1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		 float age = sc.nextFloat();
		 String name = sc.nextLine();
		 System.out.println("Enter your name:");
		 name = sc.nextLine();
		 System.out.println("your age is:"+age+"\n your Name is:"+name);
	}
}
