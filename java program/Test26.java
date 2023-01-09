//string builder
class  Test26
{
	public static void main(String[] args) 
	{
		long startTime= System.currentTimeMillis();
		StringBuffer sb= new StringBuffer ("java");
		for(int i=0;i<100000;i++)
		{
			sb.append("StringBuffer");
		}
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken by StringBuffer:"+(endTime - startTime)+"ms");
	//Starting time string builder
	startTime=System.currentTimeMillis();
	StringBuffer sb2 = new StringBuilder("java");
	for(int i=0;i<100000;i++)
		{
		sb2.append("StringBuilder");
		}
		endTime=System.currentTimeMillis();
		System.out.println("Time taken by StringBuilder:"+(endTime-startTime)+"ms");
	}
}
