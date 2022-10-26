package entities;

public class Comparator {

    public char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    private String seqLetra;

    public String getSeqLetra() {
        return seqLetra;
    }

    public void setSeqLetra(String seqLetra) {
        this.seqLetra = seqLetra;
    }

    String[] seqLetras = getSeqLetra().split("(?!^)");
    /*for(int i=0;i<=26;i++){

    }*/
}
