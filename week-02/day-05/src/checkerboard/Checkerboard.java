package checkerboard;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int countI = 0;
        for (int i = 0; i < HEIGHT; i+= 40) {
            int countJ = 0;
            int countK = 0;
            for (int j = 0; j < WIDTH; j+= 40) {
                if (countI % 2 == 0){
                    if (countJ % 2 == 0){
                        graphics.drawRect(j, i, 40, 40);
                    } else {
                        graphics.fillRect(j, i, 40, 40);
                    }
                    countJ++;
                }
            }
            for (int j = 0; j < WIDTH; j+= 40) {
                if (countI % 2 != 0){
                    if (countK % 2 != 0){
                        graphics.drawRect(j, i, 40, 40);
                    } else {
                        graphics.fillRect(j, i, 40, 40);
                    }
                    countK++;
                }
            }
            countI++;
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
