package arrays;
// remove duplicate from sorted array
// and return number of distinct elements
public class Problem_26 {
	static int removeDuplicates(int[] nums) {
        int size=nums.length;
        int j=1;
        for(int i=1;i<size;i++)
        {
            if(nums[i]!=nums[i-1])
            {
            	nums[j]=nums[i];
            	j++;
            }
        }
        return j;
	}
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,3,3,3};
		int res=removeDuplicates(arr);
		System.out.println("number os distinct elements : "+res);
	}
}
