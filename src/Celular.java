public class Celular{
    public static void main(String[] args) {
        Celular meuCelular = new Celular();
        meuCelular.enviarMensagem("(85) 98944-2782","Bom dia! Como você está?");
        meuCelular.tocarMusica("(Spotify) Aespa - Black Mamba");

    }
    public void  tocarMusica( String Musica){
        System.out.println("Está tocando"  +": " +  Musica);
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println(

                "Enviando mensagem para " + numero + ": " + mensagem);

    }


}