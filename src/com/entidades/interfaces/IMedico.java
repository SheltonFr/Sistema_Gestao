package com.entidades.interfaces;

import com.entidades.classes.pessoas.Paciente;

public interface IMedico {
    public abstract Paciente marcarConsulta();
    public abstract void atenderPaciente(Paciente paciente);
}
