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

    public static boolean inserirPonto(Point p) {
        if (countPoints % 2 == 1) {
            p1 = p;
        } else {
            p2 = p;
        }
        countPoints++;

        return p1 != null && p2 != null;
    }

    public static void dda(Point p){
        if(inserirPonto(p)){
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

    public static void bresenham(Point p){
        if(inserirPonto(p)){
            bresenham(p1, p2);
        }
    }

    public static void bresenham(Point p1, Point p2){
        bresenham(p1.x, p1.y, p2.x, p2.y);
    }

    private static void bresenham (int x1, int y1, int x2, int y2) {
        System.out.println("Entrei no bresenham");
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        int x = x1;
        int y = y1;

        int xIncr, yIncr, p, c1, c2;

        // //colore(x, y, cor);
        // buffer.setRGB(x, y, Color.BLACK.getRGB());
        Point pontoDesenhar = new Point(x, y, p1.g2d);
        pontoDesenhar.draw();

        if (deltaX < 0) {
            deltaX = -deltaX;
            xIncr = -1;
        } else {
            xIncr = 1;
        }

        if (deltaY < 0) {
            deltaY = -deltaY;
            yIncr = -1;
        } else {
            yIncr = 1;
        }

        if (deltaX > deltaY) { // 1 caso
            p = 2 * deltaY - deltaX;
            c1 = 2 * deltaY;
            c2 = 2 * (deltaY - deltaX);

            for (int k = 1; k <= deltaX; k++) {
                x += xIncr;
                if (p < 0) {
                    p += c1;
                } else {
                    p += c2;
                    y += yIncr;
                }

                //colore(x, y, cor);
                // buffer.setRGB(x, y, Color.BLACK.getRGB());
                pontoDesenhar = new Point(x, y, p1.g2d);
                pontoDesenhar.draw();
            }// fim for
        }// fim if
        else { // 2 caso
            p = 2 * deltaX - deltaY;
            c1 = 2 * deltaX;
            c2 = 2 * (deltaX - deltaY);

            for (int k = 1; k <= deltaY; k++) {
                y += yIncr;
                if (p < 0) {
                    p += c1;
                } else {
                    p += c2;
                    x += xIncr;
                }
                // //colore(x, y, cor);
                // buffer.setRGB(x, y, Color.BLACK.getRGB());
                pontoDesenhar = new Point(x, y, p1.g2d);
                pontoDesenhar.draw();
            }// fim for
        }// fim else
        p1 = null;
        p2 = null;
    }
  }
