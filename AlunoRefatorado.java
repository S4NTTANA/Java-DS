package com.mycompany.auladecarlota.Vetores;

import java.util.Scanner;

public class AlunoRefatorado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        boolean validarNota;
        double priNota;
        double segNota;
        
        do{
            System.out.println("Primeira nota: ");
            priNota = ler.nextDouble();
            validarNota = priNota >= 0 && priNota <= 10;
            
        } while(!validarNota);

        do{
            System.out.println("Segunda nota: ");
            segNota = ler.nextDouble();
            validarNota = segNota >= 0 && segNota <= 10;
            
        } while(!validarNota);

        double media = (priNota + segNota) / 2;

        System.out.println("Primeira nota: " + priNota);
        System.out.println("Segunda nota: " + segNota);
        
        
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Verificação suplementar!");
        } else {
            System.out.println("Reprovado!");
        }
   
        ler.close();
    }
}