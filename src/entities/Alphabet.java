package entities;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {

    private List<SeqIn> entradas = new ArrayList<>();


    public Alphabet() {
    }

    public Alphabet(List<SeqIn> entradas) {
        this.entradas = entradas;
    }

    public List<SeqIn> getEntradas() {
        return entradas;
    }

    public void setEntradas(List<SeqIn> entradas) {
        this.entradas = entradas;
    }

    public void addEntradas(SeqIn entrada){
        entradas.add(entrada);
    }

}

