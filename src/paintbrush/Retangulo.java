package paintbrush;

import java.awt.Color;

/**
 * @author Ernesto
 * @author Wisney
 */
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
        setColor(c);
        Reta r1  = new Reta(p1, p2);
        Reta r2 = new Reta(p2, p3);
        Reta r3 = new Reta(p3, p4);
        Reta r4 = new Reta(p4, p1);

        r1.bresenham();
        r2.bresenham();
        r3.bresenham();
        r4.bresenham();

        countPoints = 0;
    }
    
    public void transladar(int tx, int ty)
    {
        plotar(Color.WHITE);
        
        p1.transladar(tx,ty);
        p2.transladar(tx,ty);
        p3.transladar(tx,ty);
        p4.transladar(tx,ty);
        
        plotar(Color.RED);
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
    
    public void escalar(Double ex, Double ey)
    {

        plotar(Color.white);

        p1.escalar(ex, ey);
        p2.escalar(ex, ey);
        p3.escalar(ex, ey);
        p4.escalar(ex, ey);

        plotar(Color.red);
    }
    
    public void setColor(Color c)
    {
        p1.color = p2.color = p3.color = p4.color = c;
    }
}