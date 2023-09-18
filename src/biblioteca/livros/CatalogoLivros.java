package biblioteca.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public  List<Livro>pesquisarAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro: livroList) {
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(livro);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoINicial, int anoFinal){
        List<Livro>livroPorIntevaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro: livroList) {
                if(livro.getAnoPublicacao() >= anoINicial && livro.getAnoPublicacao() <= anoFinal){
                    livroPorIntevaloAnos.add(livro);
                }
            }
        }
        return livroPorIntevaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro: livroList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
