package com.entidades.interfaces;

import com.entidades.classes.pessoas.Paciente;

public interface IMedico {
    public abstract void atenderPaciente(Paciente paciente);
    public abstract void formularRelatorio();
}
