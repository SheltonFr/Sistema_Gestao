package com.entidades.classes;

import com.entidades.classes.pessoas.Pessoa;

public class Funcionario extends Pessoa {
    private String login;
    private String senha;

    public Funcionario(String nome, int idade, String sexo, String statusPessoa, String tipoSanguineo){
        super(nome, idade, sexo, statusPessoa, tipoSanguineo);
    }

    public Funcionario(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
