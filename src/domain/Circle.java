package domain;
import domain.animator.Animator;
import domain.animator.CircleAnimator;
import javax.swing.*;
import java.awt.*;

public class Circle extends Figure {
       protected int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, radius, radius);
        g.fillOval(x, y, radius, radius);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new CircleAnimator(this, component);
    }
}
