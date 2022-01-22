import java.util.Scanner;

public class TicTacToe {
    public static void main (String args[]){
        char[][] gameBoard = {{'\u00A0','|','\u00A0','|','\u00A0'},
                              {'-','+','-','+','-'},
                              {'\u00A0','|','\u00A0','|','\u00A0'},
                              {'-','+','-','+','-'},
                              {'\u00A0','|','\u00A0','|','\u00A0'}};

        printGameBoard(gameBoard);

        System.out.println("Enter your position between (0-9)");
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        System.out.println(pos);

        switch(pos) {
            case 1:
                gameBoard[0][0] = 'X';
                break;
            case 2:
                gameBoard[0][2] = 'X';
                break;
            case 3:
                gameBoard[0][5] = 'X';
                break;
            case 4:
                gameBoard[2][0] = 'X';
                break;
            case 5:
                gameBoard[2][2] = 'X';
                break;
            case 6:
                gameBoard[2][5] = 'X';
                break;
            case 7:
                gameBoard[4][0] = 'X';
                break;
            case 8:
                gameBoard[4][2] = 'X';
                break;
            case 9:
                gameBoard[4][6] = 'X';
                break;
            default:
                break;

        }
        printGameBoard(gameBoard);
    }

    public static void printGameBoard(char[][] gameBoard){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(gameBoard[i][j] + "");
            }
            System.out.print("\n");
        }
    }
}
