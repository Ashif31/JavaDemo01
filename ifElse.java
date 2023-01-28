package abc;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		
		if (a==12||a>=1 &&a<=2) {
			System.out.println("Winter");
		}
		else if (a>=3 && a<=6)
		{
			System.out.println("Summer");
		}
		else if (a>=7 && a<=9)
		{
			System.out.println("Monsoon");
		}
		else if (a>=10 && a<=11)
		{
			System.out.println("Autumn");
		}
		else 
		{ 
			System.out.println("Invalid Month");
		}
	}

}
