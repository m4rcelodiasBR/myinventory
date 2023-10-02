package br.com.m4systems.myinventory.entity;

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
    private String local;
    private String incumbencia;
    private Boolean ativo;

    public Material() {}

    public Material(Integer numPat, String nome, String descricao, String numeroSerie, String marca, String local, String incumbencia, Boolean ativo) {
        this.numPat = numPat;
        this.nome = nome;
        this.descricao = descricao;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.local = local;
        this.incumbencia = incumbencia;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Material{" +
                "numPat='" + numPat + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", marca='" + marca + '\'' +
                ", local='" + local + '\'' +
                ", incumbencia='" + incumbencia + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
