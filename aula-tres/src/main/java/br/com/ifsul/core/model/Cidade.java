package br.com.ifsul.core.model;


public class Cidade {

    private String nome;
    private String sigla;
    private Estado estado;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSigla(){
        return this.sigla;
    }
    
    public Estado getEstado(){
        return this.estado;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSigla(String sigla){
        this.sigla = sigla;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    public Cidade(){}

    public Cidade(Estado estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Instancia: Cidade [%s]", this.nome;
    }
    
}
