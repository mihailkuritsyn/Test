package edu.netcracker.lecture1.impl;

import edu.netcracker.lecture1.Direction;
import edu.netcracker.lecture1.api.Moveable;
import edu.netcracker.lecture1.api.Turnable;

/**
 * Created by miku0215 on 05.07.2016.
 */
public class Rover implements Moveable, Turnable {

    private Direction direction;
    private int x;
    private int y;

    public static void main(String[] args) {
        System.out.println("Start");
        Rover rover = new Rover();
        rover.move(1, 5);
        rover.turnTo(Direction.EAST);
        System.out.println("End");
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("moved to: x=" + x + " y=" + y);
    }

    public void turnTo(Direction direction) {
        this.direction = direction;
        System.out.println("turned to: " + direction);
    }
}
