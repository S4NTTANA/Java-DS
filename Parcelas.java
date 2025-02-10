package com.mycompany.calcinhaazul;
import java.util.Scanner;

public class Parcelas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor do Produto: ");
        double valor = scanner.nextDouble();
        
        double parcelas = valor / 5;
        String mercado = "Mercado Mamão com açúcar";
        
        System.out.println("" + mercado);
        System.out.println("Parcelas: " + parcelas);
         
    }
    
}
