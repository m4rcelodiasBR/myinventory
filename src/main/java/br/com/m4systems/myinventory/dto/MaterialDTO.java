package br.com.m4systems.myinventory.dto;


public class MaterialDTO {

    private Integer numPat;
    private String nome;
    private String descricao;
    private String numeroSerie;
    private String marca;
    private String local;
    private String compartimento;
    private Boolean ativo;

    public Integer getNumPat() {
        return numPat;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getLocal() {
        return local;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setNumPat(Integer numPat) {
        this.numPat = numPat;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}