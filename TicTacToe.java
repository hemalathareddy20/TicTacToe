public class TicTacToe {

   public static void main(String[] args){
          System.out.println("Welcome to TicTacToe program");
          char[] board = createBoard();
   }

   public static char[] createBoard() {
          char[] board=new char[10];
   for(int i=1;i<=10;i++){
             board[i]= ' ';
   }
     return board;
  }
}
