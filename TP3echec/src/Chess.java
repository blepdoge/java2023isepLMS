import java.util.Scanner;

public class Chess {
    private final Cell[][] board = new Cell[8][8];
    private Player[] players;
    private Player currentPlayer;
    private Scanner scanner;

    // On decrit brievement la logique du jeu
    public void play() {
        while (true) {
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()) {
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }

    private void switchPlayer() {
    }

    private void updateBoard(String move) {
        
    }

    private boolean isValidMove(String move) {

        return false;
    }

    private String askMove() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter your move: ");
        String move = scanner.nextLine();

        return null;
    }

    private void printBoard() {
        System.out.println("  a   b   c   d   e   f   g   h");
        for (int i=0; i<8; i++) {
            System.out.print(8-i + " ");
            for (int j=0; j<8; j++) {
                if (board[i][j].isEmpty()) {
                    System.out.print("--+ ");
                } else {
                    System.out.print(board[i][j].getPiece().colorName() + board[i][j].getPiece().name() + " ");
                }
            }
            System.out.println();
        }
        
    }

    private boolean isCheckMate() {

        return false;
    }
    public Cell getCell(int i, int j) {
        return this.board[i][j];
    }

    private void initialiseBoard() {
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                board[i][j] = new Cell(new Position(i, j));
            }
        }
        board[0][0].setPiece(new Rook(true));
        board[0][1].setPiece(new Knight(true));
        board[0][2].setPiece(new Bishop(true));
        board[0][3].setPiece(new King(true));
        board[0][4].setPiece(new Queen(true));
        board[0][5].setPiece(new Bishop(true));
        board[0][6].setPiece(new Knight(true));
        board[0][7].setPiece(new Rook(true));
        board[7][0].setPiece(new Rook(false));
        board[7][1].setPiece(new Knight(false));
        board[7][2].setPiece(new Bishop(false));
        board[7][3].setPiece(new Queen(false));
        board[7][4].setPiece(new King(false));
        board[7][5].setPiece(new Bishop(false));
        board[7][6].setPiece(new Knight(false));
        board[7][7].setPiece(new Rook(false));

        for (int i=0; i<8; i++) {
            board[1][i].setPiece(new Pawn(true));
            board[6][i].setPiece(new Pawn(false));
        }
        
    }

    private void createPlayers() {
        this.scanner = new Scanner(System.in);
        System.out.println("Please enter name of player 1: ");
        String player1Name = scanner.nextLine();
        System.out.println("Please enter name of player 2: ");
        String player2Name = scanner.nextLine();
        Player player1 = new Player(player1Name, true);
        Player player2 = new Player(player2Name, false);
        System.out.println("initializing game '" + player1Name + "' against '" + player2Name + "'");
        this.players = new Player[] { player1, player2 };
        this.currentPlayer = player1;
    }
// On declare et implemente les autres methodes mentionnees plus haut
}
