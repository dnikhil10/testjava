package practice;
class CreditCard
{
	void cashback()
	{
		System.out.println("get cashback from creditcard");
	}
}
class HdfcCard extends CreditCard
{
	void cashback()
	{
		System.out.println("get 10% offer");
	}
}
class IciciCard extends CreditCard
{
	void cashback()
	{
		System.out.println("get 15% offer");
	}
}
class Amazon 
{
	void shop(CreditCard c1)
	{
		System.out.println("pay using card");
		c1.cashback();
	}
}

public class Test5 {
    public static void main(String[] args) {
    Amazon a1=new Amazon();
    a1.shop(new HdfcCard());
    a1.shop(new IciciCard());
	}

}
