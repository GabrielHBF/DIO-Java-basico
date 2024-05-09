public class Livro {

    private String autor;
    private String titulo;
    private int anoDePublicacao;

    public Livro(String autor,String titulo, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    
    @Override
    public String toString() {
      return "Livro{" +
          "titulo='" + titulo + '\'' +
          ", autor='" + autor + '\'' +
          ", anoPublicacao=" + anoDePublicacao +
          '}';
    }
    

}
