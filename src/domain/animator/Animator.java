package domain.animator;

import domain.Figure;
import javax.swing.*;
public abstract class Animator implements Runnable {
    protected Figure figure;
    protected JComponent component;

    public Animator(Figure figure, JComponent component) {
        this.figure = figure;
        this.component = component;
    }
}
