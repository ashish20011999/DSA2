public class SearchWord {
    public static void main(String[] args) {
        Character[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(searchWord(board, word));
    }
    public static boolean searchWord(Character[][] board, String word)
    {
        int i=0;
        int j=0;
        boolean flag = true;
        outerloop:
        for(i=0;i<board.length;i++)
        {
            for(j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    break outerloop;
                }
            }
        }
        for(int k=0;k<word.length();k++)
        {
            flag=searchDirections(board,i,j,word.charAt(k));
            if(flag==false)
                break;
        }
     return flag;
    }
    public static boolean searchDirections(Character[][] board, int row,int column, char target)
    {
        if(row-1>=0 && board[row-1][column]==target) {
            row = row - 1;
            column = column;
            return true;
        }
        else if(row+1<board[row].length && board[row+1][column]==target) {
            row = row + 1;
            column = column;
            return true;
        }
        else if(column-1>=0 && board[row][column-1]==target) {
            row = row;
            column = column-1;
            return true;
        }
        else if(column+1<board.length && board[row][column+1]==target) {
            row = row;
            column = column+1;
            return true;
        }
        return false;
    }

}
