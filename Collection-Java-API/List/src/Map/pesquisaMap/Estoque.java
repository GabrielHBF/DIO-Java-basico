package Map.pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

		private Map<Long, Produto> ListaDeProdutos;
		
		public Estoque() {
			ListaDeProdutos = new HashMap<>();
		}
		
		public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
			ListaDeProdutos.put(cod, new Produto(nome,quantidade,preco));
		}
		
		public void exibirProdutos() {
			if(!ListaDeProdutos.isEmpty()) {
			System.out.println(ListaDeProdutos);
			}else {
				throw new RuntimeException("A lista esta vazia");
			}
		}
		
		public double calcularValorTotalEstoque() {
			double valorTotal = 0d;
			if(!ListaDeProdutos.isEmpty()) {
				for(Produto p : ListaDeProdutos.values()) {
					valorTotal += p.getPreco() * p.getQuantidade();
				}
			}else {
				throw new RuntimeException("A lista esta vazia");
			}
			return valorTotal;
		}
		
		public Produto obterProdutoMaisCaro() {
			Produto produtoMaisCaro = null;
			double valorMaiscaro = 0d;
			if(!ListaDeProdutos.isEmpty()) {
				for(Produto p : ListaDeProdutos.values()) {
					if(p.getPreco() > valorMaiscaro) {
						produtoMaisCaro = p;
						valorMaiscaro = p.getPreco();
					}
				}
			}
			return produtoMaisCaro;
		}
		public Produto obterProdutoMaisBarato() {
			Produto produtoMaisBarato = null;
			double valorMaisbarato = 0d;
			if(!ListaDeProdutos.isEmpty()) {
				for(Produto p : ListaDeProdutos.values()) {
					if(p.getPreco() < valorMaisbarato) {
						produtoMaisBarato = p;
						valorMaisbarato = p.getPreco();
					}
				}
			}
			return produtoMaisBarato;
		}
		
		public Produto ProdutoComMaiorValorNoEstoque() {
			Produto ProdutoMaiorValor = null;
			double maiorValor = 0d;
			if(!ListaDeProdutos.isEmpty()) {
				for(Produto p : ListaDeProdutos.values()) {
					if(maiorValor > p.getPreco() * p.getQuantidade()) {
						ProdutoMaiorValor = p;
						maiorValor = p.getPreco() * p.getQuantidade();
					}
				}
			}else {
				throw new RuntimeException("A lista esta vazia");
			}
			return ProdutoMaiorValor;
		}
		
		public static void main(String[] args) {
			Estoque estoque = new Estoque();
			estoque.adicionarProduto(123456, "caxaça", 100, 50.5);
			estoque.adicionarProduto(45678944, "coca cola", 60, 12.0);
			estoque.exibirProdutos();
			System.out.println(estoque.obterProdutoMaisCaro());
			System.out.println(estoque.calcularValorTotalEstoque());
			
		}
}	
