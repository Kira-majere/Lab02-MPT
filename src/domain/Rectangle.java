package domain;
import domain.animator.Animator;
import domain.animator.RectangleAnimator;
import javax.swing.*;
import java.awt.*;

public class Rectangle extends Figure{
    protected int length;
    protected int height;

    public Rectangle() {
    }
    public Rectangle(int x, int y, int length, int height, Color color) {
        super(x, y, color);
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x, y, length, height);
        g.fillRect(x, y, length, height);
    }

    @Override
    public Animator getAnimator(JComponent component) {
        return new RectangleAnimator(this, component);
    }
}
