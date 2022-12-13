package assignment;

public class Break {

	public static void main(String[] args) {
		
		int []arr = new int[5];
		arr[0]=12;
		arr[1]=34;
		arr[2]=66;
		arr[3]=85;
		arr[4]=900;
		
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
			if(arr[i]==85)
			{
				break;
		    }
		}
	}

}
