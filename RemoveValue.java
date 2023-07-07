import java.util.Arrays;

public class RemoveValue {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(Arrays.toString(removeValues(arr,3)));
    }
    public static int[] removeValues(int[] a, int val) {
        int index =0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=val)
            {
                a[index]=a[i];
                index++;
            }
        }
        return a;
    }
}
