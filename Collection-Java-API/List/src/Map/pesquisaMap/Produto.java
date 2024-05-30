package Map.pesquisaMap;

public class Produto {
	
		private String nomeProduto;
		private int quantidade;
		private double preco;
		
		public Produto(String nomeproduto, int quantidade, double preco) {
			this.nomeProduto = nomeproduto;
			this.quantidade = quantidade;
			this.preco = preco;
		}

		public String getNomeProduto() {
			return nomeProduto;
		}

		public double getPreco() {
			return preco;
		}

		public int getQuantidade() {
			return quantidade;
		}
		
		 @Override
		  public String toString() {
		    return "Produto{" +
		        "nome='" + nomeProduto + '\'' +
		        ", preco=" + preco +
		        ", quantidade=" + quantidade +
		        '}';
		  }

		
		
		
}
