public class CelularComJogo{
    public static void main(String[] args) {
        System.out.println();
        CelularComJogo meuCelularComJogo = new CelularComJogo();
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