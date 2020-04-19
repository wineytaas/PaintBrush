/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;


/**
 *
 * @author Disney
 * @author Ernesto
 */
public class Reta {

    private Point p1;
    private Point p2;
    private static int countPoints = 0;

    Reta(){
        this(null, null);
    }

    Reta(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean inserirPonto(Point p) {
        if (countPoints == 0) {
            this.p1 = p;
        } else {
            this.p2 = p;
        }

        countPoints++;

        return p1 != null && p2 != null;
    }

    public boolean dda(Point p){
        boolean inserir = inserirPonto(p);
        if(inserir){
            dda(p1, p2);
        }
        return inserir;
    }

    public void dda(Point p10, Point p20) {
        if (p10.x < p20.x) {
            this.p1 = p10;
            this.p2 = p20;
        } else {
            this.p1 = p20;
            this.p2 = p10;
        }
        dda();
    }

    private void dda() {
        System.out.println("Entrei no dda");
        int deltaX = this.p2.x - this.p1.x;
        int deltaY = this.p2.y - this.p1.y;

        double x = (double) p1.x, y = (double) p1.y;

        Point pontoDesenhar = p1.clone(); // new Point((int) Math.round(x), (int) Math.round(y), p1.g2d);
        pontoDesenhar.x = (int) Math.round(x);
        pontoDesenhar.y = (int) Math.round(y);
        pontoDesenhar.draw();

        int passos = Math.max(Math.abs(deltaX), Math.abs(deltaY));
        double xIncr = ((double) deltaX) / ((double) passos);
        double yIncr = ((double) deltaY) / ((double) passos);

        for (int k = 1; k <= passos; k++) {
            x += xIncr;
            y += yIncr;
            pontoDesenhar.x = (int) Math.round(x);
            pontoDesenhar.y = (int) Math.round(y);
            pontoDesenhar.draw();
            //pontoDesenhar = new Point((int) Math.round(x), (int) Math.round(y), p1.g2d);
            pontoDesenhar.draw();
        }

        //p1 = p2 = null;
        countPoints = 0;
    }

    public boolean bresenham(Point p){
        boolean inserir = inserirPonto(p);
        if(inserir){
            bresenham();
        }
        
        return inserir;
    }

    public void bresenham(){

        int x1 = p1.x, y1 = p1.y , x2 = p2.x, y2 = p2.y;

        System.out.println("============ Bresenham ============");
        System.out.println("X1: " + x1 + " Y1: " + y1 + " X2: " + x2 + " Y2: " + y2 + " Color" + p1.color);
        int deltaX = x2 - x1;
        int deltaY = y2 - y1;
        int x = x1;
        int y = y1;

        int xIncr, yIncr, p, c1, c2;

        // //colore(x, y, cor);
        // buffer.setRGB(x, y, Color.BLACK.getRGB());
        Point pontoDesenhar = p1.clone();
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
                //pontoDesenhar = new Point(x, y, p1.g2d);
                pontoDesenhar.x = x;
                pontoDesenhar.y = y;
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
                //pontoDesenhar = new Point(x, y, p1.g2d);
                pontoDesenhar.x = x;
                pontoDesenhar.y = y;
                pontoDesenhar.draw();
            }// fim for
        }// fim else
        //p1 = p2 = null;
        countPoints = 0;
    }

    public void rotacionar(int grau)
    {
        System.out.println("============ Rotação de Reta ============");
        p1.color = p2.color = Color.white;
        bresenham();
        
        
        double grauRad = Math.toRadians(grau);
        double sinGrauRad = Math.sin(grauRad);
        double cosGrauRad = Math.cos(grauRad);

        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;
        
        int novox2 = (int)(deltaX*cosGrauRad - deltaY*sinGrauRad) ;
        int novoy2 = (int)(deltaX*sinGrauRad + deltaY*cosGrauRad);

        p2.x = novox2 + p1.x;
        p2.y = novoy2 + p1.y;
        
        //p1.rotacionar(grau);
        //p2.rotacionar(grau);

        p1.color = p2.color = Color.red;
        bresenham();
    }

    public void escalar(double valorA, double valorB){
        p1.color = p2.color = Color.white;
        bresenham();

        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;
        
        p2.x = (int)(Math.round(deltaX * valorA));
        p2.y = (int)(Math.round(deltaY * valorB));
        
        p2.x += p1.x;
        p2.y += p1.y;

        p1.color = p2.color = Color.red;
        bresenham();
        
    }

    public void transladar(int tx, int ty)
    {
        p1.color = p2.color = Color.white;
        bresenham();
        
        /*
        p1.x = p1.x + valorA;
        p2.x = p2.x + valorA;
        p1.y = p1.y + valorB;
        p2.y = p2.y + valorB;*/
        
        p1.transladar(tx, ty);
        p2.transladar(tx, ty);

        p1.color = p2.color = Color.red;
        bresenham();
    }
  
    public void reflexaoX()
    {
        p1.color = p2.color = Color.white;
        bresenham();

        int deltaX = (p2.x - p1.x);
        int deltaY = (p2.y - p1.y) * -1;
        
        int novoX2 = deltaX + p1.x;
        int novoY2 = deltaY + p1.y;
        
        p2.x = novoX2;
        p2.y = novoY2;
        
        p1.color = p2.color = Color.red;
        bresenham();
    }

    public void reflexaoY()
    {
        p1.color = p2.color = Color.white;
        bresenham();

        int deltaX = (p2.x - p1.x) * -1;
        int deltaY = (p2.y - p1.y);

        int novoX2 = deltaX + p1.x;
        int novoY2 = deltaY + p1.y;
        
        p2.x = novoX2;
        p2.y = novoY2;
        
        p1.color = p2.color = Color.red;
        bresenham();
    }

    public void reflexaoXY()
    {
        p1.color = p2.color = Color.white;
        bresenham();

        int deltaX = (p2.x - p1.x) * -1;
        int deltaY = (p2.y - p1.y) * -1;

        int novoX2 = deltaX + p1.x;
        int novoY2 = deltaY + p1.y;

        p2.x = novoX2;
        p2.y = novoY2;
        
        p1.color = p2.color = Color.red;
        bresenham();
    }
    
    public void setColor(Color c)
    {
        p1.color = p2.color = c;
    }
}
