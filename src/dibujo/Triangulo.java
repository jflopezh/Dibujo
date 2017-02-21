package dibujo;
import ch.aplu.turtle.Turtle;

public class Triangulo {
    private double lado;
    private int direccion;
    
    public Triangulo(double l, int d){
        lado = l;
        direccion = d;
    }
    
    public void Dibujar(Turtle Tortuga){
        if(direccion>1){
            Tortuga.penUp();
            Tortuga.fd(lado*(direccion-1)/2);
            Tortuga.penDown();
        }            
        int AnguloInicial=(direccion*30);
        Tortuga.right(AnguloInicial);
        for(int i=0;i<3;i++){
            Tortuga.fd(lado);
            if(i==2)
                Tortuga.right(120-AnguloInicial);
            else
                Tortuga.right(120);
        }
        if(direccion>1){
            Tortuga.penUp();
            Tortuga.bk(lado*(direccion-1)/2);
            Tortuga.penDown();
        }
    }
}
