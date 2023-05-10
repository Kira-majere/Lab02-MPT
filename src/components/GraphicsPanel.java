package components;

import domain.Figure;

import javax.swing.*;
import java.awt.*;
import java.util.List;
public class GraphicsPanel extends JPanel {
        private List<Figure> figures;

        public List<Figure> getFigures() {
            return figures;
        }

        public void setFigures(List<Figure> figures) {
            this.figures = figures;
        }

        public GraphicsPanel(List<Figure> figures) {
            this.figures = figures;
        }

        public GraphicsPanel() {
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Figure figure: figures) {
                figure.draw(g);
            }
        }


}
