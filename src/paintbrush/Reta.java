/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;


/**
 *
 * @author Disney
 * @author Ernesto
 * @author Raiana
 */
public class Reta {

    private static Point p1;
    private static Point p2;
    private static int countPoints = 0;

    public static void dda(Point p) {
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

    public static void dda(Point p10, Point p20) {
        if (p10.x < p20.x) {
            p1 = p10;
            p2 = p20;
        } else {
            p1 = p20;
            p2 = p10;
        }
        dda();
    }

    private static void dda() {
        System.out.println("Entrei no dda");
        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;

        double x = (double) p1.x, y = (double) p1.y;

        Point pontoDesenhar = new Point((int) Math.round(x), (int) Math.round(y), p1.g2d);
        pontoDesenhar.draw();

        int passos = Math.max(Math.abs(deltaX), Math.abs(deltaY));
        double xIncr = ((double) deltaX) / ((double) passos);
        double yIncr = ((double) deltaY) / ((double) passos);

        for (int k = 1; k <= passos; k++) {
            x += xIncr;
            y += yIncr;
            pontoDesenhar = new Point((int) Math.round(x), (int) Math.round(y), p1.g2d);
            pontoDesenhar.draw();
        }
        p1 = null;
        p2 = null;
    }
}
