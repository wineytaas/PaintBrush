package paintbrush;

public class Retangulo {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private static int countPoints = 0;

    public boolean inserirPonto(Point p) {
        if(countPoints == 0){
            p1 = p;
        }
        else if(countPoints == 1){
            p2 = p;
        }
        else if(countPoints == 2){
            p3 = p;
        }
        else{
            p4 = p;
        }
        countPoints++;

        return p1 != null && p2 != null && p3 != null && p4 != null;
    }

    public void inserir(Point p){
        if(inserirPonto(p)){
            Reta r1  = new Reta(p1, p2);
            Reta r2 = new Reta(p2, p3);
            Reta r3 = new Reta(p3, p4);
            Reta r4 = new Reta(p4, p1);

            r1.bresenham();
            r2.bresenham();
            r3.bresenham();
            r4.bresenham();

            p1 = p2 = p3 = p4 = null;
            countPoints = 0;
        }
    }
}