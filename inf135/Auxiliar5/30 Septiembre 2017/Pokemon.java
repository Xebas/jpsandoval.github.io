class Pokemon {
    String nombre;
    int tipo;
    int nivel;
    
    Pokemon(String nom, int tip, int niv) {
        nombre = nom;
        tipo = tip;
        nivel = niv;
    }
    /*
     * hierba 0
     * agua 1
     * fuego 2
     * agua gana a fuego fuego gana a hierba y 
     * hierba agana a agua
     * Por dos puntos, completar el metodo batalla
     * para el caso que dos pokemones del mismo tipo
     * peleen, ganara el que tenga mayor nivel, en caso
     * de empatar, devolver "empate".
     */
    boolean batalla(Pokemon otro) {
        boolean gana;
        if(this.tipo == 0 && otro.tipo == 2) {
            gana = false;
        } else if(this.tipo == 2 && otro.tipo == 0) {
            gana = true;
        } else if(this.tipo < otro.tipo) {
            gana = true;
        } else {
            gana = false;
        }
        return gana;
    }
}