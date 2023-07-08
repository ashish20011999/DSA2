import java.util.Deque;
import java.util.LinkedList;

public class ReverseNumber {
    public static void main(String[] args) {
        int number =  -1200;
        System.out.println(reverseNumber(number));
    }
    public static int  reverseNumber(int number)
    {
       String numString = String.valueOf(number);
       if(numString.contains("-"))
       {
           numString = numString.substring(1,numString.length());
       }
       int length = numString.length()-1;
       int result = 0;
       while(length>=0)
       {
           result += Integer.parseInt(String.valueOf(numString.charAt(length)))*Math.pow(10,length);
           length--;
       }
       int zeroCount = 0;
       if(result<Math.pow(-2,31) || result>Math.pow(2,31) )
            return 0;
       if(number<0)
           return result*-1;
       else
           return result;
    }
}
