import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> listLivros = new ArrayList<>();

    public CatalogoLivros(String autor,String titulo, int anoDePublicacao){
        listLivros.add(new Livro(autor, titulo, anoDePublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!listLivros.isEmpty()){
            for (Livro livro : listLivros) {
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.add(livro);
                };    
            }
            return livrosPorAutor;
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listIntervaloDeAno = new ArrayList<>();
        if (!listLivros.isEmpty()) {
            for (Livro l : listLivros) {
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal){
                    listIntervaloDeAno.add(l);
                }
            }
        }
        return listIntervaloDeAno;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livro = null;
        if(!listLivros.isEmpty()){
            for (Livro l : listLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)){

                    livro = l;
                    break;
                }
            }
        }else{
            throw new RuntimeException("A lista esta vazia");
        }
        return livro;

    }


}
