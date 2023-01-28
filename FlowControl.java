package abc;

public class FlowControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100,b=71,c=70;
		if (a>=b && a>=c) 
		{
			System.out.println("Largest numbe is a " +a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("Largest numbe is b " +b);
		}
		else {
			System.out.println("Largest numbe is c " +c);
		}

	}
}
