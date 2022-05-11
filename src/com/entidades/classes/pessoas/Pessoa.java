package com.entidades.classes.pessoas;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected String statusPessoa;
    protected String tipoSanguineo;

    public Pessoa(String nome, int idade, String sexo, String statusPessoa, String tipoSanguineo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.statusPessoa = statusPessoa;
        this.tipoSanguineo = tipoSanguineo;
    }
    public Pessoa(){}
}
