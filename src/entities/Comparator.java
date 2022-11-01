package entities;

public class Comparator {

    public Comparator(){
    }
    public char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public String seqLetra;

    public int valorMax;
    public Comparator(int valorMax) {
        this.valorMax = valorMax;
    }

    public String stringMax;

    public Comparator(String stringMax) {
        this.stringMax = stringMax;
    }

    public String getSeqLetra() {
        return seqLetra;
    }

    public void seqLetra(String seqLetra){
        int n=0; int x=0; int i=0;
        String[] vetorSeq = new String[seqLetra.length()];
        int[] vetorMax = new int[seqLetra.length()];
        int tamanhoEntrada = (seqLetra.length()-1);
        int tamanhoAlfabeto = (alfabeto.length-1);

        valorMax = 0;
        stringMax = "";

        char split[] = seqLetra.toCharArray();

        boolean fimVetor = false;
        int somaSeq=0;
        String seqValida = "";

        while( n<= tamanhoEntrada && !fimVetor){
            while (i <= tamanhoAlfabeto){
                if (Character.compare(split[n],alfabeto[i]) == 0) {
                    seqValida = seqValida.concat(String.valueOf(split[n]));
                    somaSeq++; i++;
                    if (n+1 <= tamanhoEntrada) {
                        n++;
                    }else{
                        fimVetor = true;
                    }
                } else {
                    i++;
                }
            }
            vetorSeq[x] = seqValida;
            vetorMax[x] = somaSeq;
            seqValida = ""; somaSeq = 0; i=0; x++;
        }

        stringMax = vetorSeq[0];
        valorMax = vetorMax[0];
        for(x=0;x <= (seqLetra.length()-1);x++){
            if ( vetorMax[x] >= valorMax){
                stringMax = vetorSeq[x];
                valorMax = vetorMax[x];
            }
        }



    }

}


