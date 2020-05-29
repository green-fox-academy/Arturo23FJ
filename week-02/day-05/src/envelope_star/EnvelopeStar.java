package envelope_star;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {
        for (int i = 1; i < 16; i++) {
            if (i % 2 == 0){
                graphics.setColor(new Color(219, 9, 9));
            }else{
                graphics.setColor(Color.BLACK);
            }
            graphics.drawLine(WIDTH / 2 / 15 * i, HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) - HEIGHT / 2 / 15 * i);
            graphics.drawLine(WIDTH - (WIDTH / 2 / 15 * i), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) - HEIGHT / 2 / 15 * i);
            graphics.drawLine(WIDTH / 2 / 15 * i, HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) + HEIGHT / 2 / 15 * i);
            graphics.drawLine(WIDTH - (WIDTH / 2 / 15 * i), HEIGHT / 2, WIDTH / 2, (HEIGHT / 2) + HEIGHT / 2 / 15 * i);
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

            this.setBackground(new Color(38, 37, 35, 128));
        }
    }
}