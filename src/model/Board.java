package model;

import java.util.Arrays;

/**
 *  Trying to create the board for the game (¤﹏¤)
 */
public class Board {
    private final char[][] array; // The board is essentially a 2D array.

    public Board() {
        this.array = new char[6][7]; // Rows first, columns second.
        initialise(this.array);
    }

    private void initialise(char[][] array) {
        fillGrid(array);
        drawGrid(array);
    }

    private void fillGrid(char[][] array) {
        for (char[] row : array) {
            Arrays.fill(row, '.'); // '.' stands for empty spot in array.
        }
    }

    private void drawGrid(char[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col]);
            }
            System.out.println(); // Go to new line for next row.
        }
    }
}
