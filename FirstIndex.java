public class FirstIndex {
    public static void main(String[] args) {
        String haystack ="dadfdvdfvsad";
        String needle = "sad";
        System.out.println(returnFirstIndex(haystack,needle));
    }

    public static int returnFirstIndex(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if((i+needle.length()<haystack.length()+1)&&haystack.substring(i,i+needle.length()).equals(needle))
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
