package line_in_the_middle;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
    public static void mainDraw(Graphics graphics){
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.

        int beginRedX = 0;
        int beginAndEndRedY = HEIGHT / 2;
        int endRedX = WIDTH;

        int beginAndEndGreenX = WIDTH / 2;
        int beginGreenY = 0;
        int endGreenY= HEIGHT;

        graphics.setColor(Color.RED);
        graphics.drawLine(beginRedX, beginAndEndRedY, endRedX, beginAndEndRedY);

        graphics.setColor(Color.GREEN);
        graphics.drawLine(beginAndEndGreenX, beginGreenY, beginAndEndGreenX, endGreenY);
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
