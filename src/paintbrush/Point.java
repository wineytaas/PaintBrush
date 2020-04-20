package paintbrush;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * @author Ernesto
 * @author Wisney
 */
public class Point
{
    public int x;
    public int y;
    public Graphics2D g2d;
    public static int largura;
    public static int altura;
    public Color color;
    public float tamanho;

    Point(){
       this(0,0,null);
    }
    
    Point(int x, int y, Graphics g){
       this(x,y,g,0, 0);
    }
    
    Point(int x, int y, Graphics g, int p_altura, int p_largura ){
       this(x,y,(Graphics2D) g, p_altura, p_largura, Color.RED);
    }
    
    Point(int x, int y, Graphics2D g2d){
       this(x,y,g2d, 0, 0, Color.RED);
    }
    
    Point(int x, int y, Graphics2D g2d, int p_altura, int p_largura, Color cor){
       this.x = x;
       this.y = y;
       this.g2d = g2d;
       if(p_altura > 0)
        this.altura = p_altura;
       if(p_largura > 0)
        this.largura = p_largura;
       this.color = cor;
       this.tamanho = 0.1f;
    }
    
    public void draw()
    {
        draw(tamanho);
    }
    public void draw(float tamanho)
    {
        g2d.setStroke(new BasicStroke(tamanho));
        g2d.setColor(color);
        
        int drawX = x;
        int drawY = y;

        g2d.draw(new Line2D.Double(drawX, drawY, drawX, drawY));
    }

    public void rotacionar(int grau)
    {
         double grauRad = Math.toRadians(grau);
         double sinGrauRad = Math.sin(grauRad);
         double cosGrauRad = Math.cos(grauRad);
         int x = this.x;
         int y = this.y;

         this.x = (int)((x * cosGrauRad) - (y * sinGrauRad));
         this.y = (int)((x * sinGrauRad) + (y * cosGrauRad));
         System.out.println("============ Rotação do ponto ============");
         System.out.println("X: " + x + " Y: " + y + " X': " + this.x + " Y': " + this.y );
    }
    
    public void transladar(int tx, int ty)
    {
        this.x += tx;
        this.y += ty;
    }
    
    public void escalar(Double ex, Double ey)
    {
        this.x = (int)(Math.round(ex * this.x));
        this.y = (int)(Math.round(ey * this.y));
    }
    
    @Override
    public Point clone()
    {
        Point pontoClonado = new Point(x, y, g2d, altura, largura,color);
        return pontoClonado;
    }
}
