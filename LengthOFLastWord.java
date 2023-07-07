public class LengthOFLastWord {
    public static void main(String[] args) {
        String word = "Hello world this is ashish";
        System.out.println(LengthOfWord(word));
    }
    public static int LengthOfWord(String word)
    {
        int start =-1;
        int end =0;
        for(int i=0;i<word.length();i++)
        {
            if(i+1<word.length() && word.charAt(i)==' ' && word.charAt(i+1)!=' ')
            {
                start = i;
            }
            end = start+1;
            while(end <word.length() && word.charAt(end)!=' ')
            {
                end++;
            }
        }
        if(start==-1 && word.contains(" "))
        {   int countSpaces =0;
            for(int i=0;i<word.length();i++)
            {
                if(word.charAt(i)==' ')
                {
                    countSpaces++;
                }
            }
            return word.length()-countSpaces;
        }
        if(start==-1)
        {
            return word.length();
        }

        return word.substring(start+1,end).length();
    }
}
