package com.mycompany.java_ds;

import java.util.Scanner;

public class Login_e_Senha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o Login do usuario: ");
        String login = ler.nextLine();
        
        System.out.println("Informe a senha do usuario: ");
        int senha = ler.nextInt();
        
        boolean resultadoLogin = login.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        // Só irá passear se as duas condições forem verdadeiras.
        if (resultadoLogin && resultadoSenha) {
            System.out.println("Bem-vindo, usuario logado!");
        } else {
            System.out.println("Nome de usario ou senha invalidos!");
        }
    }
}
