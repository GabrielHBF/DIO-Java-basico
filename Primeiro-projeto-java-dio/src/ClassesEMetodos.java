public class ClassesEMetodos
{
    public static void main(String[] args)
    {
        String PrimeiroNome = "Gabriel";
        String segundoNome = "Henrique";
        String nomeCompleto = NomeCompleto(PrimeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String NomeCompleto(String primeiroNome,String segundoNome)
    {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}