package br.unitins.model;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Pizza extends PanacheEntity {
    
    private String sabor;
    private Double valor;
    private String tamanho;
    private boolean borda;
    private String saborBorda;

    public String getSabor() {
        return sabor;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isBorda() {
        return borda;
    }
    public void setBorda(boolean borda) {
        this.borda = borda;
    }
    public String getSaborBorda() {
        return saborBorda;
    }
    public void setSaborBorda(String saborBorda) {
        this.saborBorda = saborBorda;
    }

}
