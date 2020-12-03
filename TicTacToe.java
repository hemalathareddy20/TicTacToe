import java.util.Scanner;
public class TicTacToe {

   public static void main(String[] args){
          System.out.println("Welcome to TicTacToe program");
          char[] board = createBoard();
          assignBoard();
 }

   public static char[] createBoard() {
          char[] board=new char[10];
   for(int i=1;i<=10;i++){
             board[i]= ' ';
   }
     return board;
}
   public static String assignBoard() {
        String player;
        String computer;
      	Scanner s=new Scanner(System.in);
        System.out.println("enter ur choice 0 or x");
        player=s.next();
        if(player=="0")
             computer="0";
        else
             computer="x";
           return player;
  }
}
