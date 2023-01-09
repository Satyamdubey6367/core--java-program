class  Test18
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a three digit number:");
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int rem = num%10;
		System.out.print(rem);
		num = num/10;
		rem = num%10;
		System.out.print(rem);
		num=num/10;
		System.out.println(num);
	}
}
