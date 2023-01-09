import java.util.*;
class Satya16 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter current reading:");
		int curr_read = sc.nextInt();
		System.out.println("Enter prev_read reading:");
		int prev_read = sc.nextInt();
		int nc= curr_read-prev_read;
		
		double bill =0.0;
		if(nc<=100)
		{
			bill=360;
		}
		else if(nc<=250)
		{
			bill = 360+(nc-100)*1.0;
		}
		else if(nc>250)
		{
			bill= 360+150+(nc-250)*1.2;
		}
		System.out.println("tha bill is:"+bill);
	}
}
