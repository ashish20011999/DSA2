import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,2,2,2,3,3,3};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }
    public static int[] removeDuplicates(int[] arr)
    {
        int start =0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                start++;
                arr[start]=arr[i+1];
            }
        }
        for(int j =start+1;j<arr.length;j++)
        {
            arr[j] = 0;
        }
        return arr;
    }
}
