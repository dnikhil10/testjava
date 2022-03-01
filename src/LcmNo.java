
public class LcmNo {
	
	public static int isLcm(int num1,int num2)
	{
		int n=num1;
		if(num2>num1)
		{
			n=num2;
		}
		int max=n;
		while(true)
		{
			if(n%num1==0 && n%num2==0)
			{
				return n;
			}
			n=n+max;
		}
		
	}

	public static void main(String[] args) {
	
    int ans=isLcm(30,45);
    System.out.println(ans);
	}

}
