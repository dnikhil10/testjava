package Oops;

class Movie
{
	String name;
	int budget;
	byte rating;
	Movie(String na,int bud,byte rat)
	{
		name=na;
		budget=bud;
		rating=rat;
	}
}
public class Test4 {

	public static void main(String[] args) {
	 byte rating=5;
	 Movie m1=new Movie("Thor",56000,rating);
	 System.out.println(m1.name);
	 m1.name="narcos";
	 System.out.println(m1.name);
	 System.out.println(m1.budget);
	 System.out.println(m1.rating);
	 byte ratings2=10;
	 Movie m2=new Movie("Avengers",98000,ratings2);
	 System.out.println(m2.name);
	 System.out.println(m2.budget);
	 System.out.println(m2.rating);
	 
	}

}
