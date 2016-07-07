package edu.netcracker.lecture2.impl;

import edu.netcracker.lecture2.CellState;

import java.util.Arrays;

/**
 * Created by miku0215 on 05.07.2016.
 */
public class Ground {
    private int length;
    private int width;
    private GroundCell[][] landscape;

    public Ground(int width, int length) {
        this.width = width;
        this.length = length;
        landscape = new GroundCell[length][width];

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                landscape[row][col] = new GroundCell(row, col, CellState.FREE);
            }
        }
    }

    public GroundCell[][] getLandscape() {
        return landscape;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
