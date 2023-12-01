public class Celular{
    public static void main(String[] args) {
        Celular meuCelular = new Celular();
        meuCelular.enviarMensagem("999999","Bom dia!");
        meuCelular.tocarMusica("Rock");

    }
    public void  tocarMusica( String Musica){
        System.out.println("Tocar"  +": " +  Musica);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println(

                "Enviando mensagem para " + numero + ": " + mensagem);

       }


}
