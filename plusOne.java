import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusOne {
    public static void main(String[] args) {
        int[] arr = {9,9,8,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] arr)
    {
        boolean flag = true;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=9)
            {
                flag=false;
            }
        }
        int[] result;
        if(flag==true)
        {
           result = new int[arr.length+1];
           result[0]=1;
           for(int i=1;i<result.length;i++)
           {
               result[i]=0;
           }
           return result;
        }
        else{
            result = new int[arr.length];
        }
        int carry =1;
        for(int i =arr.length-1;i>=0;i--)
        {
            result[i] = (arr[i] + carry) % 10;
            carry = (arr[i] + carry) / 10;
        }
        return result;
    }
}
