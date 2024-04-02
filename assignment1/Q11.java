package assignment1;

public class Q11 {

	public static void main(String[] args) {
		int arr[]= {4,8,2,7,6,5};
		for(int i=5;i>=0;i--)
		{
			int temp=0;
			for(int j=i-1;j>=0;j--)
			{
				
				if(arr[j]>arr[i])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<=5;i++)
		{
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println("\n==================");
		System.out.println("Second Minimum : "+arr[1]);
		System.out.println("Second Maximum : "+arr[4]);
	}

}
