import java.util.HashSet;
import java.util.Set;

public class Goal {
    public static void main(String[] args) {
        String s ="abac";
        String goal="abad";
        System.out.println(checkIfPossible(s,goal));
    }
    public static boolean checkIfPossible(String s,String goal) {
    if(s.length()!=goal.length())
    {
        return false;
    }
    else if(s.equals(goal))
    {
        Set<Character> charSet =  new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            charSet.add(s.charAt(i));
        }
        return charSet.size()<s.length();
    }
    else{
        int i =0;
        int j = s.length()-1;
        while(s.charAt(i)==goal.charAt(i))
        {
            i++;
        }
        while(s.charAt(j)==goal.charAt(j))
        {
            j--;
        }
        char[] charArr =  s.toCharArray();
        char temp =s.charAt(i);
        charArr[i] = charArr[j];
        charArr[j] = temp;
        s= new String(charArr);
        if(s.equals(goal))
            return true;
        else
            return false;
    }
}}
