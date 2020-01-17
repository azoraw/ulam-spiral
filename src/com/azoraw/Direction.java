package com.azoraw;

enum Direction {
    RIGHT,
    UP,
    LEFT,
    DOWN;

    static {
        RIGHT.nextDirection = UP;
        UP.nextDirection = LEFT;
        LEFT.nextDirection = DOWN;
        DOWN.nextDirection = RIGHT;
    }

    private Direction nextDirection;

    public Direction getNextDirection() {
        return nextDirection;
    }

    public static Direction getInitialDirection() {
        return RIGHT;
    }
}