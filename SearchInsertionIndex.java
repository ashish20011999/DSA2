public class SearchInsertionIndex {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6};
        int target =2;
        System.out.println(insertionIndex(arr,target));
    }
    public static int insertionIndex(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target<=arr[i])
            {
                return i;
            }
        }
        return arr.length;
    }
}
