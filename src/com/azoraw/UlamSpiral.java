package com.azoraw;

import java.awt.image.BufferedImage;

public class UlamSpiral {

    public static final int IMG_SIDE_SIZE = 1080;
    private final Prime prime;

    public UlamSpiral() {
        prime = new Prime();
    }

    public BufferedImage createUlamSpiralImage() {
        BufferedImage img = new BufferedImage(IMG_SIDE_SIZE, IMG_SIDE_SIZE, BufferedImage.TYPE_INT_ARGB);
        Position currentPosition = new Position();
        int number = 1;

        while (imageIsNotColored(number)) {
            colorPixel(img, currentPosition, number);
            currentPosition.move();
            currentPosition.turn();
            number++;
        }
        return img;
    }

    private void colorPixel(BufferedImage img, Position currentPosition, int number) {
        if (currentPosition.isInsideDrawableArea()) {
            int pixelColor = prime.isPrime(number) ? Color.WHITE : Color.BLACK;
            img.setRGB(currentPosition.getX(), currentPosition.getY(), pixelColor);
        }
    }

    private boolean imageIsNotColored(int number) {
        return number <= IMG_SIDE_SIZE * (IMG_SIDE_SIZE + 1);
    }

}
