/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Graphics;
import java.awt.Graphics2D;
import static paintbrush.PaintBrushFrame.drawPoint;

/**
 *
 * @author wisne
 */
public class Reta {

    private Point p1;
    private Point p2;
    private static int countPoints = 0;

    Reta() {
        this(null, null);
    }

    Reta(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void dda(Point p) {
        //System.out.println("X: " + p.x + " Y: " + p.y);
        if (countPoints % 2 == 1) {
            p1 = p;
        } else {
            p2 = p;
        }
        countPoints++;

        if (p1 != null && p2 != null) {
            dda(p1, p2);
        }
    }

    public void dda(Point p1, Point p2) {
        if (p1.x < p2.x) {
            this.p1 = p1;
            this.p2 = p2;
        } else {
            this.p1 = p2;
            this.p2 = p1;
        }
        dda();
        //dda(this.p1.x, this.p1.y, this.p2.x, this.p2.y, this.p1.g2d);
    }

    private void dda() {
        System.out.println("Entrei no dda");
        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;

        double x = (double) p1.x, y = (double) p1.y;

        // colore o primeiro pixel da reta
        //buffer.setRGB((int) Math.round(x), (int) Math.round(y), cor);
        Point pontoDesenhar = new Point((int) Math.round(x), (int) Math.round(y), p1.g2d);
        pontoDesenhar.draw();
        //drawPoint((Graphics2D) g, (int) Math.round(x), (int) Math.round(y));

        int passos = Math.max(Math.abs(deltaX), Math.abs(deltaY));
        double xIncr = ((double) deltaX) / ((double) passos);
        double yIncr = ((double) deltaY) / ((double) passos);

        for (int k = 1; k <= passos; k++) {
            x += xIncr;
            y += yIncr;
            pontoDesenhar = new Point((int) Math.round(x), (int) Math.round(y), p1.g2d);
            pontoDesenhar.draw();
            //drawPoint((Graphics2D) g, (int) Math.round(x), (int) Math.round(y));
            //buffer.setRGB((int) Math.round(x), (int) Math.round(y), cor);
        }
        p1 = null;
        p2 = null;
    }

    public void dda(int x1, int y1, int x2, int y2, Graphics g) {//, int cor) {
        System.out.println("Entrei no dda");
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;

        double x = (double) x1, y = (double) y1;

        // colore o primeiro pixel da reta
        //buffer.setRGB((int) Math.round(x), (int) Math.round(y), cor);
        drawPoint((Graphics2D) g, (int) Math.round(x), (int) Math.round(y));

        int passos = Math.max(Math.abs(deltaX), Math.abs(deltaY));
        double xIncr = ((double) deltaX) / ((double) passos);
        double yIncr = ((double) deltaY) / ((double) passos);

        for (int k = 1; k <= passos; k++) {
            x += xIncr;
            y += yIncr;
            drawPoint((Graphics2D) g, (int) Math.round(x), (int) Math.round(y));
            //buffer.setRGB((int) Math.round(x), (int) Math.round(y), cor);
        }
        this.p1 = null;
        this.p2 = null;
        
    }
}
