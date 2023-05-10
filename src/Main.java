import components.GraphicsPanel;

import domain.Circle;
import domain.Rectangle;
import domain.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(50, 150, 100, Color.CYAN));
        figures.add(new Circle(150, 150, 120, Color.RED));
        figures.add(new Rectangle(500, 150, 100, 60, Color.BLUE));
        figures.add(new Rectangle(150, 500, 100, 60, Color.GREEN));

        GraphicsPanel canvas = new GraphicsPanel(figures);

        for (Figure s : figures) {
            Thread t = new Thread(s.getAnimator(canvas));
            t.start();
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(canvas);
        frame.setVisible(true);
    }
}