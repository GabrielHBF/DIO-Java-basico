package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

import list.Itens;

public class CarrinhoDeCompra {
    
    List<Itens> ListaDeItens;

    public CarrinhoDeCompra(){
        this.ListaDeItens = new ArrayList<>();
    }

    public void AdcionarIten(String nome, int quantidade, double preco){
        this.ListaDeItens.add(new Itens(nome,quantidade, preco));
    }

    public void RemoverDoItem(String nome){

        List<Itens> itensParaRemover = new ArrayList<>();

        for(Itens i : ListaDeItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        ListaDeItens.removeAll(itensParaRemover);

    }

    public void CalcularValorTotal(){
        double valorTotal = 0;
        for (Itens i : ListaDeItens) {
            valorTotal += i.getPreco() * i.getQuantidade();
        };
        System.out.println(valorTotal);

    }

    public void ExibirItens(){
        for (Itens i : ListaDeItens) {
            System.out.println("Item : " + i.getNome()+ " | Preco: "+i.getPreco()+" | Quantidade: "+ i.getQuantidade());
        }
    }
        public static void main(String[] args) {
            CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
            carrinho.AdcionarIten("teclado", 50, 185.10);
            carrinho.AdcionarIten("monitor", 40, 1000.10);
            carrinho.ExibirItens();
            carrinho.CalcularValorTotal();

        }

}
