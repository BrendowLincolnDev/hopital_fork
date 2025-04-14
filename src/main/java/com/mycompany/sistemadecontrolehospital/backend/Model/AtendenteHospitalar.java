package com.mycompany.sistemadecontrolehospital.backend.Model;

import java.util.Date;

public class AtendenteHospitalar extends DadoPessoal {
    public String setor;
    public int chSemanal;

    public AtendenteHospitalar(String setor, int chSemanal, String nomeCompleto, Date dataNascimento, Endereco endereco, ContatoTelEmail contato, Genero genero) {
        super(nomeCompleto, dataNascimento, endereco, contato, genero);
        this.setor = setor;
        this.chSemanal = chSemanal;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getChSemanal() {
        return chSemanal;
    }

    public void setChSemanal(int chSemanal) {
        this.chSemanal = chSemanal;
    }
    
}
