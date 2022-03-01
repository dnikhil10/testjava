package eduraka.java;
class AdharCard
{
	private String name;
	private int age;
	private long adharno;
	
	public AdharCard(String name,int age,long adharno)
	{
		this.name=name;
		this.age=age;
		this.adharno=adharno;
	}
	public String getname()
	{
		System.out.println("take name in date base");
		return name;
	}
	public int getage()
	{
		System.out.println("take age in data base");
		return age;
	}
	public long getadharno()
	{
		System.out.println("generate and validate code");
		return adharno ;
	}
}
public class Test5 {

	public static void main(String[] args) 
	{
		AdharCard a1=new AdharCard("narendra modi",71,8971008303l);
		long no = a1.getadharno();
		System.out.println(no);
		
		int a=a1.getage();
		System.out.println(a);
		
		
	}

}
