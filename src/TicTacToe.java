import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[]) {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while (true) {
            int playerPos = 'o';
            while (true) {
                System.out.println("Enter your position between (1-9)");
                Scanner sc = new Scanner(System.in);
                playerPos = sc.nextInt();
                if (posIsEmpty(gameBoard, playerPos)) {
                    break;
                }
                System.out.println("Position is already taken. Please choose another Position.");
            }

            placePiece(gameBoard, playerPos, "player");

            if (checkWinner(gameBoard)) {
                break;
            }

            int cpuPos;
            while (true) {
                Random rand = new Random();
                cpuPos = rand.nextInt(9) + 1;

                if (posIsEmpty(gameBoard, cpuPos)) {
                    break;
                }
            }

            placePiece(gameBoard, cpuPos, "cpu");

            if (checkWinner(gameBoard)) {
                break;
            }
            printGameBoard(gameBoard);
        }
    }

    public static void printGameBoard(char[][] gameBoard) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(gameBoard[i][j] + "");
            }
            System.out.print("\n");
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
        } else if (user.equals("cpu")) {
            symbol = 'O';
        }
        switch (pos) {
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
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static boolean checkWinner(char[][] gameBoard) {
        //Horizontal Win
        if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }
        if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }
        if (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }

        //Vertical Wins

        if (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }

        if (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }

        if (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }

        //Diagonal Wins
        if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }

        if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0] == 'X') {
            printGameBoard(gameBoard);
            System.out.println("Player Wins");
            return true;
        }
        if (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0] == 'O') {
            printGameBoard(gameBoard);
            System.out.println("Computer Wins");
            return true;
        }

        if (gameBoard[0][0] != ' ' && gameBoard[0][2] != ' ' && gameBoard[0][4] != ' ' &&
                gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[2][4] != ' ' &&
                gameBoard[4][0] != ' ' && gameBoard[4][2] != ' ' && gameBoard[4][4] != ' ') {
            printGameBoard(gameBoard);
            System.out.println("Its a tie");
            return true;
        }
        return false;
    }

    public static boolean posIsEmpty(char[][] gameBoard, int pos) {
        switch (pos) {
            case 1:
                if (gameBoard[0][0] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 2:
                if (gameBoard[0][2] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 3:
                if (gameBoard[0][4] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 4:
                if (gameBoard[2][0] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 5:
                if (gameBoard[2][2] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 6:
                if (gameBoard[2][4] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 7:
                if (gameBoard[4][0] != ' ') {
                    return false;
                } else {
                    return true;
                }
            case 8:
                if (gameBoard[4][2] != ' ') {
                    return false;
                }
            case 9:
                if (gameBoard[4][4] != ' ') {
                    return false;
                } else {
                    return true;
                }
            default:
                return false;
        }
    }
}
