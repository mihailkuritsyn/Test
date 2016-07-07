package edu.netcracker.lecture2.impl;


import edu.netcracker.lecture2.CellState;

/**
 * Created by miku0215 on 05.07.2016.
 */
public class GroundCell {
    private CellState state;
    private int x;
    private int y;

    public GroundCell(int x, int y, CellState state) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    public CellState getState() {
        return state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
