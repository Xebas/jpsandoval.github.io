/**
 * rivera.rodrigo08@gmail.com
 * Formato de entrega: ApellidosNombres_Carrea_practica3Puntos.zip o .rar
 *          Ej: Juan Hernesto Perez Soliz PerezSolizJuanHernesto_Sistemas_practica3Puntos.zip
 *          
 * Plazo limite: Martes 26 de Septiembre del 2017 hasta las 11:59 am(Zona horaria de Bolivia)
 */
class ContadorBinario {
    int cifra1;
    int cifra2;
    int cifra3;
    
    ContadorBinario() {
        cifra1 = 0;
        cifra2 = 0;
        cifra3 = 0;
    }
    
    ContadorBinario(int numero) {
        //Dado un numero, convertirlo a binario (1 puntos)
    }
    
    int incrementarContador() { //(2 puntos)
        if(this.cifra3 == 0) {
            this.cifra3 = 1;
        } else if(this.cifra3 == 1) {
            this.cifra3 = 0;
            this.cifra2 = 1;
        }
        if(this.cifra2 == 1) {
            this.cifra2 = 0;
            this.cifra1 = 1;
        }
        return 0;
    }
}