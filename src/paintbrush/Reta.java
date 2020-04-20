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
    public double u1;
    public double u2;
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

        Point pontoDesenhar = p1.clone(); 
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
            pontoDesenhar.draw();
        }

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

        if (deltaX > deltaY) { 
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
                pontoDesenhar.x = x;
                pontoDesenhar.y = y;
                pontoDesenhar.draw();
            }
        }
        else { 
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
                pontoDesenhar.x = x;
                pontoDesenhar.y = y;
                pontoDesenhar.draw();
            }
        }
        countPoints = 0;
    }

    public void rotacionar(int grau)
    {
        System.out.println("============ Rotação de Reta ============");
        setColor(Color.white);
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

        setColor(Color.red);
        bresenham();
    }

    public void escalar(Double ex, Double ey){
        setColor(Color.white);
        bresenham();

        p1.escalar(ex, ey);
        p2.escalar(ex, ey);
        
        setColor(Color.red);
        bresenham();
        
    }

    public void transladar(int tx, int ty)
    {
        p1.color = p2.color = Color.white;
        bresenham();

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

    public int obtemCodigo( int xDado, int yDado, int xMin, int yMin, int xMax, int yMax ) {
        int codigo = 0;
        
        if (xDado < xMin) {
            codigo += 1;
        }
        if ( xDado > xMax) {
            codigo += 2;
        }

        if ( yDado < yMin) {
            codigo += 4;
        }
        if ( yDado > yMax) {
            codigo += 8;
        }

        return codigo;
    }
    
    public int bit(int codigo, int pos) {

        int bit = codigo << (31 - pos);
        bit = bit >>> 31;
        return bit;
    }
    
    public void cohenSutherland(Point p1Dado, Point p2Dado, Point pMin, Point pMax) {

        int x1Dado = p1Dado.x;
        int y1Dado = p1Dado.y;
        int x2Dado = p2Dado.x;
        int y2Dado = p2Dado.y;
        int xMin = pMin.x;
        int yMin = pMin.y;
        int xMax = pMax.x;
        int yMax = pMax.y;

        boolean aceito = false;
        boolean feito = false;

        int cFora;

        double xInt = 0, yInt = 0; 

        while (!feito) {
            int c1 = obtemCodigo(x1Dado, y1Dado, xMin, yMin, xMax, yMax);
            int c2 = obtemCodigo( x2Dado, y2Dado, xMin, yMin, xMax, yMax);

            if (c1 == 0 && c2 == 0) {
                aceito = true;
                feito = true;
            } else if ((c1 & c2) != 0) { 

                feito = true;
            } else { 

                cFora = (c1 != 0) ? c1 : c2;

                if (bit(cFora, 0) == 1) {
                    xInt = xMin;
                    yInt = y1Dado + (y2Dado - y1Dado) * (xMin - x1Dado) / (x2Dado - x1Dado);

                } else if (bit(cFora, 1) == 1) {
                    xInt = xMax;
                    yInt = y1Dado + (y2Dado - y1Dado) * (xMax - x1Dado) / (x2Dado - x1Dado);

                } else if (bit(cFora, 2) == 1) {
                    yInt = yMin;
                    xInt = x1Dado + (x2Dado - x1Dado) * (yMin - y1Dado) / (y2Dado - y1Dado);

                } else if (bit(cFora, 3) == 1) { 
                    yInt = yMax;
                    xInt = x1Dado + (x2Dado - x1Dado) * (yMax - y1Dado) / (y2Dado - y1Dado);

                }

                if (cFora == c1) {
                    x1Dado = (int)(Math.round(xInt));
                    y1Dado = (int)(Math.round(yInt));
                    
                } else {
                    x2Dado = (int)(Math.round(xInt));
                    y2Dado = (int)(Math.round(yInt));
                    
                }

            }
        }
        
        if(aceito) {
            p1.x = x1Dado;
            p1.y = y1Dado;
            p2.x = x2Dado;
            p2.y= y2Dado;

            this.dda(p1Dado, p2Dado);
        }
    }
       
    public boolean clipset(double p, double q) {
        double r = q / p;

        if (p < 0) {
            if (r > 1) {
                return false;
            } else if (r > u1) {
                u1 = r;
            }
        } else if (p > 0) {
            if (r < 0) {
                return false;
            } else if (r < u2) {
                u2 = r;
            }
        } else if (q < 0) {
            return false;
        }
        return true;
    }
    
    public void liang(Point p1Dado, Point p2Dado, Point pMin, Point pMax) {
      
        double x1Dado =  p1Dado.x;
        double y1Dado = p1Dado.y;
        double x2Dado = p2Dado.x;
        double y2Dado = p2Dado.y;
        int xMin = pMin.x;
        int yMin = pMin.y;
        int xMax = pMax.x;
        int yMax = pMax.y;

        double dx = x2Dado - x1Dado,
               dy = y2Dado - y1Dado;
        
        this.u1 = 0.0;
        this.u2 = 1.0;


        if (clipset(-dx, x1Dado - xMin)) {
            
            if (clipset(dx, xMax - x1Dado)) {
                
                if (clipset(-dy, y1Dado - yMin)) {
                    
                    if (clipset(dy, yMax - y1Dado)) {
                        

                        if (u2 < 1.0) {
                            x2Dado = x1Dado + dx * u2;
                            y2Dado = y1Dado + dy * u2;
                        }
                        if (u1 > 0.0) {
                            x1Dado = x1Dado + dx * u1;
                            y1Dado = y1Dado + dy * u1;
                        }

                        dda(p1Dado, p2Dado);

                        p1.x = (int)(Math.round(x1Dado));
                        p1.y = (int)(Math.round(y1Dado));
                        p2.x = (int)(Math.round(x2Dado));
                        p2.y = (int)(Math.round(y2Dado));
                    }
                }
            }
        }

    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

}
