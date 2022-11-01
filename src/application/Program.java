package application;

import entities.Alphabet;
import entities.BiggerSequence;
import entities.Comparator;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Alphabet valorDigitado= new Alphabet();
        Comparator comparator = new Comparator();

        String entradas;

        int controle = 1;
        int i=0;
        while (controle == 1){
            System.out.println("Digite a sequencia de letras:");
            valorDigitado.addEntradas(i,entradas = sc.next());
            System.out.println("Digite 0 para finalizar ou 1 para continuar");
            controle = sc.nextInt();
            i++;
        }

        BiggerSequence biggerSequence = new BiggerSequence();

        for (int j = 0; j <= i-1; j++) {
            if(j==0){
                comparator.seqLetra(valorDigitado.getEntradas(j));
                biggerSequence.valorMaxSequenciaMaior = comparator.valorMax;
                biggerSequence.sequenciaMaior = comparator.stringMax;
                biggerSequence.valorMaxSequencia = comparator.valorMax;
                biggerSequence.sequencia = comparator.stringMax;
            }else {
                comparator.seqLetra(valorDigitado.getEntradas(j));
                biggerSequence.valorMaxSequencia = comparator.valorMax;
                biggerSequence.sequencia = comparator.stringMax;
                biggerSequence.defineMaiorMenor(biggerSequence.sequenciaMaior,biggerSequence.valorMaxSequenciaMaior, biggerSequence.sequencia, biggerSequence.valorMaxSequencia);
            }
        }

        System.out.println("A maior sequencia dentre as strings digitas foi: " + biggerSequence.sequenciaMaior);
    }
}
