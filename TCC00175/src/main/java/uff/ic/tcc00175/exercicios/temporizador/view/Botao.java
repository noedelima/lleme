package uff.ic.tcc00175.exercicios.temporizador.view;

import java.awt.Button;
import java.awt.event.ActionListener;

public abstract class Botao extends Button implements ActionListener {

    public Botao(String nome) {
        super(nome);
        addActionListener(this);
    }
}
