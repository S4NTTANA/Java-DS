package com.mycompany.calcinhaazul;

import java.util.Scanner;

public class MediaeAnaliser {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
                
        System.out.println("Informe o valor da primeira nota: ");
        double Pnota = scanner.nextDouble();
                
        System.out.println("Informe o valor da segunda nota: ");
        double Snota = scanner.nextDouble();
        
        double media;
        
        media = (Pnota + Snota) / 2;
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média: " + media);
        
        if (media > 7) {
            System.out.println("Aprovado!");} 
        else if (media > 4.9 && media < 7){
            System.out.println("Analisando situação!");} 
        else {
            System.out.println("Reprovado");
        }
        
    }
    
    }
