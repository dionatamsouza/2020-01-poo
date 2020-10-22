package br.com.ifsul.core.model;


public class Estado {

    private String nome;
    private String sigla;
    private Pais pais;

    public Estado(){}

    public Estado(Pais pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        return "Instancia: Estado [%s]", this.nome;
    }
    
}
