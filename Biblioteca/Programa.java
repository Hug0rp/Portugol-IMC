package Biblioteca;

public class Programa {
    public static void main(String args[]){
        Livro livroMach = new Livro();

        livroMach.titulo = "Dom Casmurro";
        livroMach.anoPublicado = 1899;
  
        Autor autMach = new Autor("Machado de Assis", "Brasileiro");
       
       

        System.out.println("O livro "+ livroMach.titulo + " foi escrito por " + autMach.nome);
    }
}
