package com.mycompany.classes_java;

public class Livro {
    
    private String titulo;
    private String autor;
    private int N_Paginas;
    private float preco;

    public Livro(String titulo, String autor, int N_Paginas, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.N_Paginas = N_Paginas;
        this.preco = preco;
    }

    public Livro() {
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getN_Paginas() {
        return N_Paginas;
    }

    public float getPreco() {
        return preco;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setN_Paginas(int N_Paginas) {
        this.N_Paginas = N_Paginas;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
