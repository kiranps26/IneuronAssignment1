package assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 1000; i++)
		{
			int counter = 0;
			for(int num = i; num >= 1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
				}
			}
			if(counter == 2)
			{
				System.out.println("Prime numbers from 1 to 1000 are : "+i);
			}
		}

}
}
