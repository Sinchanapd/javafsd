package assisted_practice;

public class LongestIncreasingSubsequence {
	static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i,j,max = 0;
        lis[0]=1;
        
        for (i=1;i<n;i++)
        {
        	lis[i]=1;
            for (j=0;j<i;j++)
            {
                if (arr[i]>arr[j] && lis[i]<lis[j]+1)
                {
                    lis[i]=lis[j]+1;
                }
            }
        }
        for (i=0;i<n;i++)
        {
        	if (max<lis[i])
        	{
        		max=lis[i];
        	}
        }    
        return max;
    }
	public static void main(String[] args) {
		int arr[]={50, 3, 10, 7, 40, 80};
        int n = arr.length;
        System.out.println("Length of longest increasing subsequence is " + lis(arr, n));
	}
}
