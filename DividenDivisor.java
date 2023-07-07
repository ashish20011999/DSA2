public class DividenDivisor {
    public static void main(String[] args) {
        System.out.println(dividendDivisor());
    }
    public static int dividendDivisor()
    {
        int dividend = -2147483648;
        int divisor =-1;
        if(dividend >= Integer.MAX_VALUE || dividend <= Integer.MIN_VALUE)
        {
            System.out.print("here ");
            long a = (dividend/divisor);
            return (int) (a*-1);
        }
        else
            return dividend/divisor;
    }
}
