package com.entidades.classes.pessoas;

import com.entidades.interfaces.ILogin;

public class Funcionario extends Pessoa implements ILogin {
    private String login;
    private String senha;
    private boolean status;



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

    @Override
    public boolean validarLogin(String username, String senha){
        if(this.login.equals(username) && this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }
}
