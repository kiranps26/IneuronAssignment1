package assignment;

public class SwitchCase {

	public static void main(String[] args) {
		
		String []arr = new String[] {"Java","JavaScript","Selenium","Python","Kiran"};
		
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
			if(arr[i]=="Selenium")
			{
				break;
			}
		}

	}

}
