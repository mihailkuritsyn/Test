package edu.netcracker.lecture2.impl;

import edu.netcracker.lecture2.Direction;
import edu.netcracker.lecture2.GroundVisor;
import edu.netcracker.lecture2.api.Moveable;
import edu.netcracker.lecture2.api.Turnable;

/**
 * Created by miku0215 on 05.07.2016.
 */
public class Rover implements Moveable, Turnable {

    private Direction direction;
    private int x;
    private int y;
    private GroundVisor visor = new GroundVisor();

    public static void main(String[] args) {
        System.out.println("Start");

        Rover r = new Rover();
        r.getVisor().setGround(new Ground(10, 10));
        r.moveTo(9, 9);
        r.moveTo(19, 9);

        System.out.println("End");
    }

    public void moveTo(int x, int y) {
        if (!visor.hasObstacles(x, y)) {
            this.x = x;
            this.y = y;
            System.out.println("moved to: x=" + x + " y=" + y);
        } else {
            System.out.println("Obstacle on coordinates: x=" + x + " y=" + y);
        }
    }

    public void turnTo(Direction direction) {
        this.direction = direction;
        System.out.println("turned to: " + direction);
    }

    public GroundVisor getVisor() {
        return visor;
    }
}
