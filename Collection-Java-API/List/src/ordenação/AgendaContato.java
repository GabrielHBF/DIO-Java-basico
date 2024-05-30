package ordenação;

import java.util.Set;

import javax.management.RuntimeErrorException;

import java.util.HashSet;

public class AgendaContato {

		private Set<Contato> ListaContato;
		
		public AgendaContato() {
			ListaContato = new HashSet<>();
		}
		
		public void AdcionarContato(String nome, int contato) {
			ListaContato.add(new Contato(nome, contato));
		}
		public void ExibirContatos() {
			if(!ListaContato.isEmpty()) {
				System.out.println(ListaContato);
			}else {
				System.out.println("O conjunto está vazio!");
			}
		}
		
		public Set<Contato> PesquisaPorNome(String nome){
			Set<Contato> PNome = new HashSet<>();
			if(!ListaContato.isEmpty()) {
			for(Contato c : ListaContato) {
				if(c.getNome().startsWith(nome)) {
					PNome.add(c);
				};
			}
				return PNome;
			}else {
			throw new RuntimeException("O conjunto esta vazio");
		}
			
			}
		
		public Contato AtualizarNumeroDoContato(String nome, int numero) {
			Contato contatoAtualizado = null;
			if(!ListaContato.isEmpty()) {
				for(Contato c : ListaContato) {
					if(c.getNome().equalsIgnoreCase(nome)) {
						c.setNumero(numero);
						contatoAtualizado = c;
						break;
					}
				}
				return contatoAtualizado;
			}else {
			      throw new RuntimeException("O conjunto está vazio!");
			
		}
}

		public static void main(String[] args) {
			AgendaContato agContato = new AgendaContato();
			agContato.AdcionarContato("gabriel henrique", 121212);
			agContato.AdcionarContato("gabriel", 112131312);
			agContato.AdcionarContato("henrique", 111111);
			agContato.AdcionarContato("roberta", 123456);
			agContato.AtualizarNumeroDoContato("gabriel", 11111111);
			System.out.println(agContato.PesquisaPorNome("gabriel"));
			//agContato.ExibirContatos();
			
		}
}
