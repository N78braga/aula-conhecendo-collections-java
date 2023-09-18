package biblioteca.livros;

public class Livro {

    private String Titulo;
    private String Autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int ano) {
        Titulo = titulo;
        Autor = autor;
        this.anoPublicacao = ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return  "( Titulo= " + Titulo + ", Autor= " + Autor + ", ano= " + anoPublicacao + " )";
    }


}
