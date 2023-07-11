import java.util.Arrays;

public class nextGreatestNumber {
    public static void main(String[] args) {
        int[] arr = {7,6,0,1,3,0};
        System.out.println(Arrays.toString(nextGreatestArray(arr)));
    }
    public static int[] nextGreatestArray(int[] arr)
    {   int i =0;
        while(arr[i]>arr[i+1])
        {
            i++;
        }
        int j=arr.length-2;
        int minIndex = arr.length-1;
        while(j>i)
        {
            if(arr[minIndex]>arr[j])
            {
                    minIndex = j;
             }
            j--;
        }
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
        return reverseArray.reverseArrayDo(arr,i);
    }
}
