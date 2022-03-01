
public class P3 {
	
	public static void decTobin(int num)
	{
		String out="";
		while(num!=0)
		{
			int rem=num%2;
			out=rem+out;
			num=num/2;
		}
		System.out.println(out);
	}
	
	public static void decTooct(int num1)
	{
		String out1="";
		while(num1!=0)
		{
			int rem1=num1%8;
			out1=rem1+out1;
			num1=num1/8;
		}
		System.out.println(out1);
	}
	
	public static void dectoHexa(int num)
	{
		String out="";
		while(num!=0)
		{
			int rem=num%16;
			if(rem>9)
			{
				out=(char)(rem+55)+out;
			}
			else
			{
				out=rem+out;
			}
			num=num/16;
			
		}
		System.out.println(out);
	}

	public static void main(String[] args) {
		decTobin(22);
		decTooct(23);
        dectoHexa(10);
	}

}
