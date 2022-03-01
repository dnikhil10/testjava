package practice;
class CurrencyNote
{
	int serialNo;
	String colour;
	int value;
	public CurrencyNote(int serialNo,int value,String colour)
	{
		this.serialNo=serialNo;
		this.value=value;
		this.colour=colour;
	}
	public boolean equal(Object ob)
	{
		CurrencyNote ctn=(CurrencyNote)ob;
		return this.serialNo==ctn.serialNo;
	}
	
}
public class Test8 {

	public static void main(String[] args) {
		CurrencyNote c1=new CurrencyNote(5674,500,"grey");
		CurrencyNote c2=new CurrencyNote(5674,500,"grey");
		System.out.println(c1==c2);
		boolean ans = c1.equal(c2);
		System.out.println(ans);

	}

}
