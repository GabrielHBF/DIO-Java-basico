public class AparelhoTelefonico implements Iiphone{

        public void Atender(){
            System.out.println("celular atendido");
        }
        public void Ligar(String numero){
            System.out.println("Ligando para" + numero);
        }
        public void IniciarCorreioDeVoz(){
            System.out.println("mensagem de voz");
        }
}
