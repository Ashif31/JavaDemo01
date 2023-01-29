package abc;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[][];
		int k =0;
		Array = new int[4][5];
		
		for (int i =0;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				Array[i][j]=k;
				System.out.println("The value in Array["+i+"]["+j+"] is : " +k);
				k++;
				
			}
		}
			

	}

}
