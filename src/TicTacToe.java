import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main (String args[]){
        char[][] gameBoard = {{'\u00A0','|','\u00A0','|','\u00A0'},
                              {'-','+','-','+','-'},
                              {'\u00A0','|','\u00A0','|','\u00A0'},
                              {'-','+','-','+','-'},
                              {'\u00A0','|','\u00A0','|','\u00A0'}};

        printGameBoard(gameBoard);

        while(true){
            System.out.println("Enter your position between (0-9)");
            Scanner sc = new Scanner(System.in);
            int playerPos = sc.nextInt();
            System.out.println(playerPos);
            placePiece(gameBoard,playerPos, "player");

            Random rand = new Random();
            int cpuPos = rand.nextInt(9)  + 1;
            placePiece(gameBoard,cpuPos, "cpu");

            printGameBoard(gameBoard);
        }

    }

    public static void printGameBoard(char[][] gameBoard){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(gameBoard[i][j] + "");
            }
            System.out.print("\n");
        }
    }
    public static void placePiece(char[][] gameBoard, int pos, String user){
        char symbol='\u00A0';
        if(user.equals("player")){
            symbol='X';
        }
        else if(user.equals("cpu")){
            symbol='O';
        }
        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = 'X';
                break;
            default:
                break;

        }
    }
}
