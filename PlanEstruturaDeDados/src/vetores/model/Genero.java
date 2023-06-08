package vetores.model;

public enum Genero {
    MASCULINO("M"), FEMININO("F");
    
    private String genero;
    
    private Genero(String g){
        this.genero = g;
    }

    @Override
    public String toString() {
        return this.genero;
    }
    
    
}
