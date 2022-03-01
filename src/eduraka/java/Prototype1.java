package eduraka.java;

class Prototype1
{
	static String name="Tango";
	static String box="black";
    String flavour;
    int cost;
    static void eating()
	{
		System.out.println("start eating...");
	}
    int buy()
	{
		System.out.println("Buy chips from store");
		return 897;
	}
    Prototype1(String flavour,int cost)
	{
	   this.cost=cost;
	   this.flavour=flavour;
	   System.out.println(this);
       System.out.println("flavour="+flavour);
	   System.out.println("cost="+cost);
	}
    public static void main(String[] args) 
	{
		Prototype1 p1=new Prototype1("Garlic",500);
		
		Prototype1 p2=new Prototype1("ginger",897);
		System.out.println(name);
		System.out.println(box);
		eating();
		System.out.println(p1.buy());

	}
}

