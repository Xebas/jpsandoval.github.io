class Pokebola {
    int nivel;
    boolean vacio;
    Pokemon pokemon;
    
    Pokebola(int niv) {
        nivel = niv;
        vacio = true;
    }
    
    boolean capturarPokemon(Pokemon otro) {
        boolean res;
        if(this.nivel >= otro.nivel && vacio == true) {
            res = true;
            pokemon = otro;
            vacio = false;
        } else {
            res = false;
        }        
        return res;
    }
}