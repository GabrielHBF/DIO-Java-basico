package ordenação;

import java.util.Objects;

public class Contato {
	private String nome;
	private int numeroTelefone;
	
	public Contato(String nome, int telefone) {
		this.nome = nome;
		this.numeroTelefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public void setNumero(int numero) {
		this.numeroTelefone = numero;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Contato contato)) return false;
		return Objects.equals(getNome(),contato.getNome());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getNome());
	}
	
	@Override
	public String toString() {
		return nome + " telefone" + numeroTelefone;
	}
	
}
