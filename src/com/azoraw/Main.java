package com.azoraw;

import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Main {

    private static final String OUTPUT_DIR = "ulam.png";

    public static void main(String[] args) {
        UlamSpiral ulamSpiral = new UlamSpiral();
        BufferedImage img = ulamSpiral.createUlamSpiralImage();
        createOutputFile(img);
    }

    private static void createOutputFile(BufferedImage img) {
        try {
            File f = new File(OUTPUT_DIR);
            f.createNewFile();
            ImageIO.write(img, "png", f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

}