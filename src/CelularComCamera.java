public class CelularComCamera {
    public static void (String[] args) {
        System.out.println();
        CelularComCamera meuCelularComCamera = new CelularComCamera();
        System.out.println("\nMetodo da Classe Celuar Com Camera");
        meuCelularComCamera.gravarVideo();
        meuCelularComCamera.aplicarFiltro("De Maquiagem ");

    }
    public void gravarVideo() {
        System.out.println(
                "Gravando um vídeo");
    }

    public void aplicarFiltro(String filtro) {
        System.out.println(
                "Aplicando filtro: " + filtro);
    }
}
V