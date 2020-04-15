package paintbrush;

import java.awt.Color;

public class Retangulo {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private static int countPoints = 0;

    public boolean inserirPonto(Point p) {
        if(countPoints % 4 == 0){
            p1 = p;
        }
        else if(countPoints % 4 == 1){
            p2 = p;
        }
        else if(countPoints % 4 == 2){
            p3 = p;
        }
        else{
            p4 = p;
        }
        countPoints++;

        return p1 != null && p2 != null && p3 != null && p4 != null;
    }

    public boolean inserir(Point p){
        boolean plotar = inserirPonto(p);
        if(plotar){
            plotar(Color.red);
        }
        return plotar;
    }

    public void plotar(Color c)
    {
        Reta r1  = new Reta(p1, p2, c);
        Reta r2 = new Reta(p2, p3, c);
        Reta r3 = new Reta(p3, p4, c);
        Reta r4 = new Reta(p4, p1, c);

        r1.bresenham();
        r2.bresenham();
        r3.bresenham();
        r4.bresenham();

        //p1 = p2 = p3 = p4 = null;
        countPoints = 0;
    }

    public void rotacionar(int grau)
    {

        plotar(Color.white);

        p1.rotacionar(grau);
        p2.rotacionar(grau);
        p3.rotacionar(grau);
        p4.rotacionar(grau);

        plotar(Color.red);
    }
}