package com.azoraw;

import static com.azoraw.UlamSpiral.IMG_SIDE_SIZE;

public class Position {

    private int x = IMG_SIDE_SIZE / 2;
    private int y = IMG_SIDE_SIZE / 2;
    private Direction direction = Direction.getInitialDirection();
    private Spiral spiral = new Spiral();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        moveInCurrentDirection();
        spiral.incrementCurrentSideLength();
    }

    public void turn() {
        if (spiral.canTurn()) {
            direction = direction.getNextDirection();
            spiral.resetCurrentSideLength();
            if (canIncreaseSpiralSide()) {
                spiral.incrementSideLength();
            }
        }
    }

    public boolean isInsideDrawableArea() {
        return x >= 0 && x < IMG_SIDE_SIZE && y >= 0 && y < IMG_SIDE_SIZE;
    }

    private void moveInCurrentDirection() {
        switch (direction) {
            case RIGHT:
                x++;
                break;
            case UP:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case DOWN:
                y++;
                break;
        }
    }


    private boolean canIncreaseSpiralSide() {
        return direction == Direction.RIGHT || direction == Direction.LEFT;
    }

}
