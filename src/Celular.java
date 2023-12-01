public class CelularComJogo extends  Celular{
    public static void main(String[] args) {
        System.out.println("\nMetodo da Classe Celuar");
        CelularComJogo meuCelularComJogo = new CelularComJogo();
        meuCelularComJogo.tocarMuisica("Axe");
        System.out.println("\nMetodo da Classe Celuar com Jogo");
        meuCelularComJogo.iniciarJogo("Mario World");
        meuCelularComJogo.pausarJogo();
    }

    public void iniciarJogo(String nomeJogo) {
        System.out.println("Iniciando o jogo: " + nomeJogo);
    }

    public void pausarJogo() {
        System.out.println("Jogo pausado");
    }
}
