package br.com.m4systems.myinventory.dto;

import br.com.m4systems.myinventory.repository.MaterialRepository;

public class MaterialDTO {

    private String numPat;
    private String nome;
    private String descricao;
    private String numeroSerie;
    private String marca;
    private String local;
    private String incumbencia;
    private boolean ativo;

    public MaterialDTO(String numPat, String nome, String descricao, String numeroSerie, String marca, String local, String incumbencia, boolean ativo) {
        this.numPat = numPat;
        this.nome = nome;
        this.descricao = descricao;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.local = local;
        this.incumbencia = incumbencia;
        this.ativo = ativo;
    }

    public String getNumPat() {
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

    public String getIncumbencia() {
        return incumbencia;
    }

    public boolean isAtivo() {
        return ativo;
    }
}