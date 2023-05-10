package domain.animator;

import domain.Figure;
import domain.Circle;
import javax.swing.*;
import java.awt.*;

public class CircleAnimator extends Animator {
    public CircleAnimator(Figure figure, JComponent component) {
        super(figure, component);
    }

    @Override
    public void run() {
        while (true) {
            figure.moveTo((int) (Math.random() * 600), (int) (Math.random() * 600), (int)(Math.random() * 0x1000000));
            if (component != null) {
                component.repaint();
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
