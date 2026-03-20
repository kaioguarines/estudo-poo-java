public class App {
    public static void main(String[] args) {
        Kitupgrade pc = new Kitupgrade();

        pc.modelo = "Ryzen";
        pc.marca = "Pichau";
        pc.memoriaRam = 8;
        pc.placamae = "b450m";
        pc.processador = "R7";
        pc.preco = 5600.00;

        Fabricante ryzen = new Fabricante();
        ryzen.nome = "Pichau";
        ryzen.endereco = "Av.Paulista 23";

        pc.fabricante = ryzen;

        double valorcomDesconto = pc.calcularDesconto(0.1);
        System.out.println("Valor com desconto: " + valorcomDesconto);

        boolean sucesso = pc.adicionarMemoriaRam(8);

        if (sucesso) {
            System.out.println("Memoria adicionada com sucesso");
            System.out.println("Quantidade de memoria: " + pc.memoriaRam);
            System.out.println("Novo valor do computador " + pc.preco);
        } else {
            System.out.println("Nao foi possivel adicionar memoria");
        }
    }
}
