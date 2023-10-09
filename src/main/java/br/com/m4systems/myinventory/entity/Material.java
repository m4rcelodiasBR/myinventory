package br.com.m4systems.myinventory.entity;

import br.com.m4systems.myinventory.dto.MaterialDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numPat;
    private String nome;
    private String descricao;
    private String numeroSerie;
    private String marca;
    private String localizacao;
    private String compartimento;
    private Boolean ativo;

    public Material() {

    }

    public Material(MaterialDTO materialDTO) {
        this.id = materialDTO.getId();
        this.numPat = materialDTO.getNumPat();
        this.nome = materialDTO.getNome();
        this.descricao = materialDTO.getDescricao();
        this.numeroSerie = materialDTO.getNumeroSerie();
        this.marca = materialDTO.getMarca();
        this.localizacao = materialDTO.getLocalizacao();
        this.compartimento = materialDTO.getCompartimento();
        this.ativo = materialDTO.getAtivo();
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

