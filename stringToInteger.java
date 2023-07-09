import static java.lang.Character.isDigit;

public class stringToInteger {
    public static void main(String[] args) {
        String string = "  -42";
        System.out.println(numberCalculate(string));
    }

    public static int numberCalculate(String string) {
        long result =0;
        if (string.length() == 0) {
            return 0;
        }
        int i = 0;
        int start = 0;
        int end = 0;
        while (i<string.length() && !isDigit(string.charAt(i))) {
            if(string.charAt(i)!=' '&&string.charAt(i)!='+'&& string.charAt(i)!='-')
            {
                return 0;
            }
            i++;
        }
        if(isDigit(string.charAt(start))){
            start = i;
            end = start;
        }
        else if(start == string.length()-1)
        {
            return 0;
        }
        while (end < string.length() && isDigit(string.charAt(end))) {
            end++;
        }
        end = end;
        System.out.println(start+ " "+end);
        if (start - 1 >= 0 && string.charAt(start - 1) == '-') {
            if(start-2>=0 && string.charAt(start-2) == '+')
            {
                return 0;
            }
            result = Long.parseLong(string.substring(start, end)) * -1;
            if(result<Math.pow(-2,31))
            {
                return Integer.MIN_VALUE;
            }
            return (int)result;
        }
        else if(start - 1 >= 0 && string.charAt(start - 1) == '+') {
            result = Long.parseLong(string.substring(start, end));
            if(start-2>=0 && string.charAt(start-2) == '-')
            {
                return 0;
            }
            if(result>Math.pow(2,31))
            {
                return Integer.MAX_VALUE;
            }
            return (int)result;
        }
        else {
            result = Long.parseLong(string.substring(start, end));
            if(result>Math.pow(2,31))
            {
                return Integer.MAX_VALUE;
            }
            return (int)result;
        }
    }
}
