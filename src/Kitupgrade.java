public class Kitupgrade {
    String modelo;
    String marca;
    double preco;
    int memoriaRam;
    String processador;
    String placamae;
    Fabricante fabricante;

    //Metodos
    public double calcularDesconto(double desconto) {
        return preco * desconto;
    }

    boolean adicionarMemoriaRam(int quantidade) {
        if (quantidade % 2 == 1) return false;
        memoriaRam += quantidade;
        preco += quantidade * 150;
        return true;
    }
}
