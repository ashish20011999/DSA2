public class maxVolume {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(calculateMaxVolume(arr));
    }
    public static int calculateMaxVolume(int[] arr)
    {
        int start=0;
        int finish =  arr.length-1;
        int maxVolume = 0;
        while(start<finish)
        {
            int volume =(finish-start)*Math.min(arr[start],arr[finish]);
            if(volume>maxVolume)
            {
                maxVolume=volume;
            }
            if(arr[start]<arr[finish])
                start++;
            else
                finish--;
        }
        return maxVolume;
    }
}
