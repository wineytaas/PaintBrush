/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbrush;

/**
 *
 * @author wisne
 */
public class Circunferencia {
    private static Point centro = null;
    private static Point raio = null;
    
    private static int count = 0;
    
    public void bresenhams(Point p)
    {
        if(count % 2 == 0)
        {
            centro = p;
        }
        else
        {
            raio = p;
        }
        count++;
        
        if(centro != null && raio != null)
        {
            bresenhams();
        }
    }
    
    private void bresenhams()
    {
        int r = distancia(centro, raio);
        int x = 0, y = r, p = 3 - 2 * r;
        Point pontoDesenhar = new Point(x , y, raio.g2d);
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
            pontoDesenhar = new Point(x , y, raio.g2d);
            desenharPontosDoCirculo(centro, pontoDesenhar);
        }
        
        centro = null;
        raio = null;
    }
    
    private int distancia(Point p1, Point p2)
    {
        double distancia = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return (int) Math.round(distancia);
    }
    
    private void desenharPontosDoCirculo(Point pc, Point p)
    {
        Point pontoDesenhar = new Point(pc.x + p.x, pc.y + p.y, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.x, pc.y + p.y, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x + p.x, pc.y - p.y, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.x, pc.y - p.y, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x + p.y, pc.y + p.x, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.y, pc.y + p.x, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x + p.y, pc.y - p.x, p.g2d);
        pontoDesenhar.draw();
        
        pontoDesenhar = new Point(pc.x - p.y, pc.y - p.x, p.g2d);
        pontoDesenhar.draw();
    }
}
