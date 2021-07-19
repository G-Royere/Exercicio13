package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<String> nomeAutor = new ArrayList<String>();
    private String tituloLivro;
    private Integer dataPublicacao;

    public Livro() {};

    public Livro( String nomeAutor, String tituloLivro, Integer dataPublicacao) {
        super();
        this.nomeAutor.add(nomeAutor);
        this.tituloLivro = tituloLivro;
        this.dataPublicacao = dataPublicacao;
    }

    public List<String> getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
         this.nomeAutor.add(nomeAutor);
    }
    public String getTituloLivro() {
        return tituloLivro;
    }
    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    public Integer getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(Integer dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return " Nome do autor: " + nomeAutor
                +"<br>Titulo do livro: " + tituloLivro 
                +" <br>Data da Publicacao: " + dataPublicacao;
    }
}
