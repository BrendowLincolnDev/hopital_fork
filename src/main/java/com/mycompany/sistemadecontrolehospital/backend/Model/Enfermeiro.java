package com.mycompany.sistemadecontrolehospital.backend.Model;

import java.util.Date;

public class Enfermeiro extends AtendenteHospitalar {
    private Long ifEnfermeiro;
    private boolean treinadoOpRX;

    public Enfermeiro(String setor, int chSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero genero) {
        super(setor, chSemanal, nomeCompleto, dataNascimento, endereco, contato, genero);
    }

    public Long getIfEnfermeiro() {
        return ifEnfermeiro;
    }

    public void setIfEnfermeiro(Long ifEnfermeiro) {
        this.ifEnfermeiro = ifEnfermeiro;
    }

    public boolean isTreinadoOpRX() {
        return treinadoOpRX;
    }

    public void setTreinadoOpRX(boolean treinadoOpRX) {
        this.treinadoOpRX = treinadoOpRX;
    }
     
}
