package com.mycompany.sistemadecontrolehospital;

import com.mycompany.sistemadecontrolehospital.frontend.Views.TelaPrincipal;
import javax.swing.*;

public class SistemaDeControleHospital {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
        });
    }
}
