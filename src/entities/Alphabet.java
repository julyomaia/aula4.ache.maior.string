package entities;

import java.util.ArrayList;

public class Alphabet {

    private ArrayList<String> entradas = new ArrayList<>();

    public Alphabet() {
    }

    public Alphabet(ArrayList<String> entradas) {
        this.entradas = entradas;
    }

    public String getEntradas(int j) {
        return entradas.get(j);
    }

    public void setEntradas(ArrayList<String> entradas) {
        this.entradas = entradas;
    }

    public void addEntradas(int i, String entrada){
        entradas.add(entrada);
    }

}

