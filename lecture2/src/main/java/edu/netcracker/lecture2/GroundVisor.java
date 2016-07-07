package edu.netcracker.lecture2;

import edu.netcracker.lecture2.impl.Ground;
import edu.netcracker.lecture2.impl.GroundCell;

/**
 * Created by miku0215 on 07.07.2016.
 */
public class GroundVisor {

    private Ground ground;

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public boolean hasObstacles(int x, int y) {
        try {
            GroundCell groundCell = ground.getLandscape()[x][y];
            return groundCell.getState().equals(CellState.OCCUPIED);
        } catch (IndexOutOfBoundsException e) {
            throw new GroundVisorException("Invalid coordinates", e);
        }
    }
}
