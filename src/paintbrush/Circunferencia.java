/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

import java.awt.Color;

/**
 * @author Ernesto
 * @author Wisney
 */
public class Circunferencia {
    private Point centro;
    private Point raio;
    private static int countPoints = 0;
    
    Circunferencia()
    {
        setColor(Color.red);
    }
    
    public boolean inserirPonto(Point p) {
        if(countPoints  % 2 == 0){
            centro = p;
        }
        else if(countPoints % 2 == 1){
            raio = p;
        }
        countPoints++;

        return centro != null && raio != null;
    }
    
    public boolean bresenhams(Point p)
    {
        boolean plotar = inserirPonto(p);
        if(plotar)
        {
            bresenhams();
        }
        return plotar;
    }
    
    private void bresenhams()
    {
        int r = distancia(centro, raio);
        int x = 0, y = r, p = 3 - 2 * r;
        Point pontoDesenhar = raio.clone();// new Point(x , y, raio.g2d);
        pontoDesenhar.x = x;
        pontoDesenhar.y = y;
        desenharPontosDoCirculo(centro, pontoDesenhar);
        
        while(x < y)
        {
            if(p < 0)
            {
                p = p + 4*x + 6;
            }
            else
            {
                p = p + 4*(x-y) + 10;
                y = y - 1;
            }
            x++;
            //pontoDesenhar = new Point(x , y, raio.g2d);
            pontoDesenhar = raio.clone();// new Point(x , y, raio.g2d);
            pontoDesenhar.x = x;
            pontoDesenhar.y = y;
            desenharPontosDoCirculo(centro, pontoDesenhar);
        }
        
        //centro = null;
        //raio = null;
    }
    
    private int distancia(Point p1, Point p2)
    {
        double distancia = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return (int) Math.round(distancia);
    }
    
    private void desenharPontosDoCirculo(Point pc, Point p)
    {
        Point pontoDesenhar = new Point(pc.x + p.x, pc.y + p.y, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.x, pc.y + p.y, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x + p.x, pc.y - p.y, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.x, pc.y - p.y, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x + p.y, pc.y + p.x, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.y, pc.y + p.x, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x + p.y, pc.y - p.x, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.y, pc.y - p.x, p.g2d, p.altura, p.largura, p.color);
        pontoDesenhar.draw();
    }
    
    public void transladar(int tx, int ty)
    {
        setColor(Color.white);
        bresenhams();
        
        centro.transladar(tx, ty);
        raio.transladar(tx, ty);
        
        setColor(Color.red);
        bresenhams();
    }
    
    public void escalar(Double ex, Double ey)
    {
        setColor(Color.white);
        bresenhams();
        
        centro.escalar(ex, ey);
        raio.escalar(ex, ey);
        
        setColor(Color.red);
        bresenhams();
    }
    
    public void setColor(Color c)
    {
        if(centro != null)
            centro.color = c;
        if(raio != null)
            raio.color = c;
    }
}
