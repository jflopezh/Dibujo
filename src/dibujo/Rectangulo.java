package dibujo;
import ch.aplu.turtle.Turtle;

public class Rectangulo {
    private double ancho;
    private double alto;
    
    public Rectangulo(double an, double al){
        ancho=an;
        alto=al;
    }
    
    public void Dibujar(Turtle Tortuga){
        boolean iancho=false;
        for(int i=0;i<4;i++){
            if(iancho){
                Tortuga.fd(ancho);
                iancho=false;
            }else{
                Tortuga.fd(alto);
                iancho=true;
            }
            Tortuga.rt(90);
        }
    }
}
