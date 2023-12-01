public class CelularBasico {

    public static void main(String[] args) {
        System.out.println("\nMétodo da Classe Celular Com Câmera");
        CelularBasico meuCelularBasico = new CelularBasico();
        System.out.println("\nMétodo da Classe Celular Básico");
        meuCelularBasico.fazerChamada("999999999");
        meuCelularBasico.configurarDespertador(10, 20);
    }

    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
    }

    public void configurarDespertador(int hora, int minuto) {
        System.out.println("Despertador configurado para as " + hora + ":" + minuto);
    }
}