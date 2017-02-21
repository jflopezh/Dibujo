package dibujo;
import ch.aplu.turtle.Turtle;

public class Casa {
    private Triangulo techo;
    private Rectangulo base;
    private Rectangulo puerta;
    private Poligono ventana;
    
    public Casa(Triangulo t, Rectangulo b, Rectangulo p, Poligono v){
        techo=t;
        base=b;
        puerta=p;
        ventana=v;
    }
    
    public void Dibujar(Turtle t){

    }
}
