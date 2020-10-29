package br.com.ifsul.core.model;


public class Estado {

    private String nome;
    private String sigla;
    private Pais pais;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public String getNome(){
        return this.nome;
    }

    public String getSigla(){
        return this.sigla;
    }

    public Estado(){}

    public Estado(Pais pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString() {
        return "Instancia: Estado [%s]", this.nome;
    }
    
}
