package ca.tictactoe.game;

/**
 *  Background two-dimensional int array to simulate the game board in memory.
 *  Also checks if a player has won the game.
 */

public class GameBoard {


    public int[][] cloneGrid = new int[5][5];

    public void newGrid() {
        for (int i=0;i<5;i++){
            for (int j=0; j<5; j++){
                cloneGrid[i][j] = 0;
            }
        }
    }

    public boolean checkVictory() {

        //Check horizontally
        for (int i=1; i<=4; i++){
            //System.out.println("checking row"+i);
            if (cloneGrid[i][1] != 0 && cloneGrid[i][1] == cloneGrid[i][2] && cloneGrid[i][3] == cloneGrid[i][4] && cloneGrid[i][1] == cloneGrid[i][4]){
                System.out.println("You Won");
                return true;
            }
        }

        //Check vertically
        for (int i=1; i<=4; i++){
            //System.out.println("checking column"+i);
            if (cloneGrid[1][i] != 0 && cloneGrid[1][i] == cloneGrid[2][i] && cloneGrid[3][i] == cloneGrid[4][i] && cloneGrid[1][i] == cloneGrid[4][i]){
                System.out.println("You Won");
                return true;
            }
        }

        //Check diagonally
        if (cloneGrid[1][1] != 0 && cloneGrid[1][1] == cloneGrid[2][2] && cloneGrid[3][3] == cloneGrid[4][4] && cloneGrid[1][1] == cloneGrid[4][4]){
            System.out.println("You won");
            return true;
        }
        if (cloneGrid[4][1] != 0 && cloneGrid[4][1] == cloneGrid[3][2] && cloneGrid[2][3] == cloneGrid[1][4] && cloneGrid[3][2] == cloneGrid[2][3]){
            System.out.println("You won");
            return true;
        }

        return false;
    }
}
