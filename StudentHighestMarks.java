package assignment;

public class StudentHighestMarks {

	public static void main(String[] args) {
		
		int[] arr = new int[] {78,12,80,82,89,55,35}; 
		
		int maxMarks=80;
		System.out.println("Marks more than 80 is :");
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>=maxMarks)
			{
				maxMarks=arr[i];
				System.out.println(maxMarks);
			}
		}
	
	}

}
