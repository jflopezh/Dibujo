package dibujo;
import ch.aplu.turtle.Turtle;

public class Poligono {
    private double radio;
    private int nlados;
    private boolean direccion;
    
    public Poligono(double r, int n, boolean d){
        radio=r;
        nlados=n;
        direccion=d;
    }
    
    public void Dibujar(Turtle Tortuga){
        double angulo=360/nlados;
        double lado=radio*2*(Math.sin(Math.toRadians(angulo/2)));
        Tortuga.rt(90);
        if(direccion)
            for(int i=0;i<nlados;i++){
                Tortuga.fd(lado);
                Tortuga.lt(angulo);
            }
        else
            for(int i=0;i<nlados;i++){
                Tortuga.fd(lado);
                Tortuga.rt(angulo);
            }
        Tortuga.lt(90);
    }
}
