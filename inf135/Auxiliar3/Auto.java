
/**
 * Write a description of class Auto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Auto
{
    double aceleracion;
    double velocidadMaxima;
    
    Auto(double a, double vm) {
        aceleracion = a;
        velocidadMaxima = vm;
    }
    
    double posicionActual(int tiempo) {
        double posicion;
        double tvm;
        tvm = velocidadMaxima/aceleracion;
        if(tiempo <= tvm) {
            posicion = 0.5*aceleracion*Math.pow(tiempo,2);
        } else {
            posicion = 0.5*aceleracion*Math.pow(tvm,2); //uniformemente acelerado
            posicion = posicion + velocidadMaxima*(tiempo -tvm); //velocidad constante
        }
        return posicion;
    }
}
