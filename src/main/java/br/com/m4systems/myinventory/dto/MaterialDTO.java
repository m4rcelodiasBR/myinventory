package br.com.m4systems.myinventory.dto;

public class MaterialDTO {

    private int numPat;
    private String nome;
    private String descricao;
    private String numeroSerie;
    private String marca;
    private String local;
    private String compartimento;
    private boolean ativo;

    public MaterialDTO(int numPat, String nome, String descricao, String numeroSerie, String marca, String local, String compartimento, boolean ativo) {
        this.numPat = numPat;
        this.nome = nome;
        this.descricao = descricao;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.local = local;
        this.compartimento = compartimento;
        this.ativo = ativo;
    }

    public int getNumPat() {
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

    public boolean isAtivo() {
        return ativo;
    }
}