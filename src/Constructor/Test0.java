package Constructor;
class CurrencyNotes
{
	String chairman;
	String institute;
	int value;
	String colour;
	long serialNo;
CurrencyNotes()
	{
		chairman="Das";
		institute="Rbi";
		System.out.println(chairman);
		System.out.println(institute);
	}
CurrencyNotes(int value,String colour,long serialNo)
	{
		this();
		this.value=value;
		this.colour=colour;
		this.serialNo=serialNo;
		System.out.println(value);
		System.out.println(colour);
		System.out.println(serialNo);
	}
}
public class Test0
{
   public static void main(String[] args) 
	{
        CurrencyNotes c1=new CurrencyNotes(500,"grey",8971008303l);
        CurrencyNotes c2=new CurrencyNotes(2000,"pink",9710218650l);

	}

}
