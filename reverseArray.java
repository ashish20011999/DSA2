import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {7,6,2,1,3,0};
        System.out.println(Arrays.toString(reverseArrayDo(arr,2)));
    }
    public static int[] reverseArrayDo(int[] arr, int index)
    {
        if(index >= arr.length-1)
        {
            return arr;
        }
        int last =arr.length-1;
        int i=index;
        while(i<last)
        {
           int temp = arr[i];
           arr[i]=arr[last];
           arr[last]=temp;
           i++;
           last--;
        }
        return arr;
    }
}