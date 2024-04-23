package com.engim.verificasimulazione2;

public class Persona {
    private String nome;
    private Sesso sesso;
    public enum Sesso{
        UOMO, DONNA
    }

    public Persona(String nome, String sesso) {
        this.nome = nome;
        if(sesso.equals("UOMO"))
        this.sesso = Sesso.UOMO;
        else this.sesso = Sesso.DONNA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }
}
