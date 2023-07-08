public class ZigZagPattern {
    public static void main(String[] args) {
        String string = "PAYPALISHIRING";
        int rowNum = 4;
        System.out.println(zigZag(string, rowNum));
    }
    public static String zigZag(String zigZag, int rowNum)
    {   String result="";
        for(int r=0;r<rowNum;r++)
        {
            int incr = 2*(rowNum-1);
            for(int i = r;i<zigZag.length();i+=incr)
            {
                result+=zigZag.charAt(i);
                if(r>0 && r<rowNum-1 && i+incr-2*r < zigZag.length())
                {
                    result+=zigZag.charAt(i+incr-2*r);
                }
            }
        }
        return result;
    }
}
