package com.entidades.interfaces;
import com.entidades.classes.pessoas.Gerente;
import com.entidades.classes.pessoas.Medico;
public interface ILogin {
    public abstract boolean validarLogin(String username, String senha);

}
