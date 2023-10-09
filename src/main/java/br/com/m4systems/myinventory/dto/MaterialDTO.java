package br.com.m4systems.myinventory.dto;


import br.com.m4systems.myinventory.entity.Material;

public class MaterialDTO {

    private Long id;
    private Integer numPat;
    private String nome;
    private String descricao;
    private String numeroSerie;
    private String marca;
    private String localizacao;
    private String compartimento;
    private Boolean ativo;

    public MaterialDTO() {

    }

    public MaterialDTO(Material material) {
        this.id = material.getId();
        this.numPat = material.getNumPat();
        this.nome = material.getNome();
        this.descricao = material.getDescricao();
        this.numeroSerie = material.getNumeroSerie();
        this.marca = material.getMarca();
        this.localizacao = material.getLocalizacao();
        this.compartimento = material.getCompartimento();
        this.ativo = material.getAtivo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumPat() {
        return numPat;
    }

    public void setNumPat(Integer numPat) {
        this.numPat = numPat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}