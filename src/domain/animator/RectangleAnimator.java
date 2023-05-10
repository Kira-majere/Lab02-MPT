package domain.animator;
import domain.Figure;
import domain.Rectangle;
import javax.swing.*;
import java.awt.*;

public class RectangleAnimator extends Animator {
    public RectangleAnimator(Figure figure, JComponent component) {
        super(figure, component);
    }

    @Override
    public void run() {
        while (true) {
            figure.moveRel(0, 0, (int)(Math.random() * 0x1000000));
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
