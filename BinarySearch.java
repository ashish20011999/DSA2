public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={-1,0,3,5,9,12};
        int target =9;
        int start = 0;
        int end = arr.length-1;
        System.out.println(binarySearchTarget(arr,target,start,end));
    }
    public static int binarySearchTarget(int[] arr, int target, int start, int end)
    {
        if(end==start && arr[start]!=target)
        {
            return-1;
        }
        int index;
        int mid = start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        index = binarySearchTarget(arr,target,start,mid);
        if(index!=-1)
            return index;
        index = binarySearchTarget(arr,target,mid+1,end);
        if(index!=-1)
            return index;
        return -1;
    }
}
