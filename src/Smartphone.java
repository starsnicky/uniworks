public class Smartphone{
    public static void main(String[] args) {
        System.out.println();
        Smartphone meuSmartphone = new Smartphone();
        meuSmartphone.instalarApp("Instagram");
        meuSmartphone.acessarInternet();
    }
    public void acessarInternet () {
        System.out.println("Conectando");
    }
    public void instalarApp (String nomeApp){
        System.out.println("Instalando o aplicativo: " + nomeApp);

    }
}