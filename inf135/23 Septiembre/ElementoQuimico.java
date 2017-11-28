public class ElementoQuimico {
    String nombre;
    double densidad;
    
    ElementoQuimico(String nom, double densidad) {
        nombre = nom;
        this.densidad = densidad;
    }
    
    String compararDensidad(ElementoQuimico otro) {
        String res;
        if(this.densidad == otro.densidad) {
            res = "Tienen la misma densidad";
        } else if(this.densidad < otro.densidad) {
            res = "Este elemento es menos denso";
        } else {
            res = "Este elemento es mas denso";
        }
        return res;
    }
    
    double calcularPeso(double volumen) {
        return this.densidad * volumen;
    }
    
    double calcularVolumen(double peso) {
        return peso / this.densidad;
    }
}