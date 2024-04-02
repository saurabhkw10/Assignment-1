package assignment1;

public class Q10 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int start=0;
		int end=6;
		for(int i=0;i<6;i++) {
			while(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
				
			}
			for (i = 0; i < 7; i++) {
	            System.out.print(+arr[i]+"  ");
	        }
		}

	}

}
