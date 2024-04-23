package com.engim.verificasimulazione2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorteggio {
    private List<Persona> personas = new ArrayList<>();
    private boolean daMischiare = true;
    private int nextName = 0;
    public void aggiungi(Persona nome){
        personas.add(nome);
        daMischiare = true;
        nextName = 0;
    }

    public Persona next(){
        if(daMischiare){
            Collections.shuffle(personas);
            daMischiare = false;
            nextName = 0;
        }
        if(nextName >= personas.size())
            throw new IndexOutOfBoundsException("Nomi finiti");
        return personas.get(nextName++);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public boolean isDaMischiare() {
        return daMischiare;
    }
}
