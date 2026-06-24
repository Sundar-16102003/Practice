import java.util.Arrays;
class Selection_sort 
{
	public static void main(String[] args) 
	{
		
	int [] nums={4,9,2,5,1,7,3};
	for(int i=nums.length-1;i>=0;i--)
		{
		int maxIndex=0;
			int max=nums[0];
	for(int j=1;j<=i;j++)
		{
		
		if(nums[j]>max)
			{
			max=nums[j];
			maxIndex=j;
		}
	}
	int temp=nums[i];
	nums[i]=nums[maxIndex];	
	nums[maxIndex]=temp;
		}
	System.out.println(Arrays.toString(nums));
}
}
