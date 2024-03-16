package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println(String.format("| %c %c %c |", input[i], input[i+1], input[i+2]));
        }
        System.out.println("---------");

        analyzeGameState(input);
    }

    public static void analyzeGameState(char[] grid){
        int countX = 0;
        int countO = 0;
        for (char cell : grid){
            if (cell == 'X'){
                countX++;
            } else if (cell == 'O') {
                countO++;
            }
        }

        if (Math.abs(countX-countO) >= 2 || (isWinner(grid, 'X') && isWinner(grid, 'O'))) {
            System.out.println("Impossible");
            return;
        }

        if (isWinner(grid, 'X')){
            System.out.println("X wins");
            return;
        } else if (isWinner(grid, 'O')){
            System.out.println("O wins");
            return;
        }

        if (countX + countO == 9){
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }

    public static boolean isWinner(char[] grid, char symbol){
        for (int i = 0; i < 3; i++){
            if (grid[i*3] == symbol && grid[i*3+1] == symbol && grid[i*3+2] == symbol){
                return true;
            }
            if (grid[i] == symbol && grid[i+3] == symbol && grid[i+6] == symbol){
                return true;
            }
        }

        if (grid[0] == symbol && grid[4] == symbol && grid[8] == symbol){
            return true;
        }
        if (grid[2] == symbol && grid[4] == symbol && grid[6] == symbol){
            return true;
        }
        return false;
    }
}
