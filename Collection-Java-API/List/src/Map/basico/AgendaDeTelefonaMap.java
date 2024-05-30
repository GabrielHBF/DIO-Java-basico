package Map.basico;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeTelefonaMap {
		private Map<String, Integer> LisataDecontatoMap;
		
		public AgendaDeTelefonaMap() {
			this.LisataDecontatoMap = new HashMap<>();
		}
		
		public void adicionarContato(String nome, Integer telefone) {
			this.LisataDecontatoMap.put(nome, telefone);
		}
		
		public void removerContato(String nome) {
			if(!this.LisataDecontatoMap.isEmpty()) {
				
			this.LisataDecontatoMap.remove(nome);
			
			}else {
				throw new RuntimeException("A Lista Esta vazia");
			}
		}
		
		public void exibirContatos() {
			if(!this.LisataDecontatoMap.isEmpty()) {
				System.out.println(this.LisataDecontatoMap);
			}
		}
		
		 public Integer pesquisarPorNome(String nome){
			 	Integer numeroContato;
			 	if(!this.LisataDecontatoMap.isEmpty()) {
			 		numeroContato = this.LisataDecontatoMap.get(nome);
			 	}else {
			 		throw new RuntimeException("A Lista Esta vazia");
			 	}
			 	return numeroContato;
			 
			 }
		 
		 public static void main(String[] args) {
			 AgendaDeTelefonaMap agenda = new AgendaDeTelefonaMap();
			 
			 agenda.adicionarContato("nome", 1546778);
			 agenda.adicionarContato("henrique", 85233695);
			 agenda.exibirContatos();
			 agenda.removerContato("henrique");
			 agenda.exibirContatos();
			 System.out.println(agenda.pesquisarPorNome("nome"));
		 }
}
