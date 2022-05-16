package com.entidades.classes.procedimentos;

public class Enfermidade {
    private String nome;
    private String tipo;
    private String descricao;


    @Override
    public String toString() {
        return "nome:" + nome +
                "\ntipo: "  + tipo +
                "\ndescricao: " + descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
