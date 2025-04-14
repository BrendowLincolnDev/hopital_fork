package com.mycompany.sistemadecontrolehospital.backend.Model;

public enum Genero {
    Masculino("M"),
    Feminino("F");
 
    private final String descricao;

    // Construtor
    Genero(String descricao) {
        this.descricao = descricao;
    }

    // Getter
    public String getDescricao() {
        return descricao;
    }
}
