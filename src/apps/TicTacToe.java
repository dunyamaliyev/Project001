package apps;

import java.util.Scanner;

public class TicTacToe {
    static char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moveCount = 0;
        boolean gameWon = false;

        while (moveCount < 9 && !gameWon) {
            printBoard();
            System.out.print("Oyunçu " + currentPlayer + ", nömrə seçin (1-9): ");
            int move;
            try {
                move = scanner.nextInt();
                if (move < 1 || move > 9 || board[move - 1] == 'X' || board[move - 1] == 'O') {
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Yanlış giriş! Rəqəm daxil edin.");
                scanner.next(); // Yanlış girişi təmizləmək
                continue;
            }

            board[move - 1] = currentPlayer;
            moveCount++;
            gameWon = checkWinner();

            if (!gameWon) {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        printBoard();
        if (gameWon) {
            System.out.println("Təbriklər! Oyunçu " + currentPlayer + " qalib gəldi!");
        } else {
            System.out.println("Heç-heçə!");
        }

        scanner.close();
    }

    static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---+---+---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    static boolean checkWinner() {
        int[][] winPositions = {
                {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Sətirlər
                {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Sütunlar
                {0, 4, 8}, {2, 4, 6}           // Diagonallar
        };

        for (int[] pos : winPositions) {
            if (board[pos[0]] == currentPlayer &&
                    board[pos[1]] == currentPlayer &&
                    board[pos[2]] == currentPlayer) {
                return true;
            }
        }
        return false;
    }
}
