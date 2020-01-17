package com.azoraw;

public class Color {

    public static final int WHITE = getWhite();
    public static final int BLACK = getBlack();

    private static int getWhite() {
        int a = 255;
        int r = 255;
        int g = 255;
        int b = 255;

        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static int getBlack() {
        int a = 255;
        int r = 0;
        int g = 0;
        int b = 0;

        return (a << 24) | (r << 16) | (g << 8) | b;
    }
}

