package triangles;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int rows = 21;
        drawTriangles(rows, graphics);
    }

    public static void drawTriangles(int rows, Graphics graphics) {
        int size = WIDTH / rows;
        int x = 0;
        int y = HEIGHT;
        int lines = 0;
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                int r = (int)(Math.random() * 256);
                int g = (int)(Math.random() * 256);
                int b = (int)(Math.random() * 256);
                graphics.setColor(new Color(r, g, b));
                drawSingleTriangle(x, y, size, graphics);
                x += size;
            }
            lines++;
            x = 0 + (lines * (size / 2));
            y -= size;
        }
    }

    public static void drawSingleTriangle(int x, int y, int size, Graphics graphics) {
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x, y, x + (size / 2), y - size);
        graphics.drawLine(x + (size / 2), y - size, x + size, y);
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

            this.setBackground(Color.BLACK);
        }
    }
}