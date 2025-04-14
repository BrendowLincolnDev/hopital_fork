package com.mycompany.sistemadecontrolehospital.backend.Model;

public class Responsavel extends ContatoTelEmail {
    private Long idResponsavel;
    private String nomeResponsavel; //Perguntar pro Brendow

    public Responsavel(String telefone, String celular, String email) {
        super(telefone, celular, email);
    }

    public Long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }
    
    
}
