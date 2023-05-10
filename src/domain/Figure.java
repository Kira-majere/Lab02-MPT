package domain;
import domain.animator.Animator;
import javax.swing.*;
import java.awt.*;

public abstract class Figure {
    protected  int x;
    protected int y;
    protected Color  color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Figure() {
    }

    public Figure(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void moveTo(int x, int y, int dcolor) {
    this.x = x;
    this.y = y;
    this.color = new Color(dcolor);
    }

    public void moveRel(int dx, int dy, int dcolor) {
        x += dx;
        y += dy;
        color = new Color(dcolor);
    }


    public abstract void draw(Graphics g);
    public abstract Animator getAnimator(JComponent component);
}
