import java.util.Scanner;
class Satya17 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter any number:");
		int num= sc.nextInt();
		if(num==0)
			System.out.println("it is zero");
		else if(num>0)
			System.out.println(num+"is positive");
		else
			System.out.println(num+"is negative");
	}
}
