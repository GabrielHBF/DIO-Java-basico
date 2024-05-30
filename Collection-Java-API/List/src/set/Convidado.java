public class Convidado {
      private String nome;
      private int numeroDeConvite;
      private int idade;

    public Convidado(String nome, int numeroDeConvite, int idade) {
        this.nome = nome;
        this.numeroDeConvite = numeroDeConvite;
        this.idade = idade;
    }
       
    public String getNome() {
        return nome;
    }


    public int getNumeroDeConvite() {
        return numeroDeConvite;
    }


    public int getIdade() {
        return idade;
    }

    public String ToString(){
        return "Convidado{" +
        "nome='" + nome + '\'' +
        ", numeroDeConvite=" + numeroDeConvite +
        ", idade=" + idade +
        '}';
    }


}
