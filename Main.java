package com.mycompany.java_ds;

public class Main {
    public static void main(String[] args) {
        
    Cliente cliente = new Cliente("Marta", "Marta@gamil.com", 42);
    
    cliente.setIdade(50);
    
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Email: " + cliente.getEmail());
    
    
    }  
}
