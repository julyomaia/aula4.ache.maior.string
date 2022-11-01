package entities;

public class BiggerSequence {

    public String sequencia;
    public int valorMaxSequencia;
    public String sequenciaMaior;
    public int valorMaxSequenciaMaior;
    public String sequenciaMenor;
    public int valorMaxSequenciaMenor;


    public void defineMaiorMenor (String sequencia1, int valorMaxSequencia1, String sequencia2, int valorMaxSequencia2 ){
        if (valorMaxSequencia1 > valorMaxSequencia2){
            valorMaxSequenciaMaior = valorMaxSequencia1;
            sequenciaMaior = sequencia1;
            valorMaxSequenciaMenor = valorMaxSequencia2;
            sequenciaMenor = sequencia2;
        } else {
            valorMaxSequenciaMaior = valorMaxSequencia2;
            sequenciaMaior = sequencia2;
            valorMaxSequenciaMenor = valorMaxSequencia1;
            sequenciaMenor = sequencia1;
        }
    }
}
