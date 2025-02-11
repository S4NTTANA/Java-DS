package com.mycompany.auladecarlota;

import java.util.Scanner;

public class NotasWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double Pnota;
        double Snota;
        
        do {
            System.out.println("Informe a 1ª nota: ");
            Pnota = ler.nextDouble();
        } while (Pnota < 0 || Pnota > 10);
        
        do {
            System.out.println("Informe a 2ª nota: ");
            Snota = ler.nextDouble();
        } while (Snota < 0 || Snota > 10);
        
        System.out.println("Primeira Nota: " + Pnota);
        System.out.println("Segunda Nota: " + Snota);
        
            
        }
        } 
    
    

