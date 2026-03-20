package com.empresa.projeto;

import com.empresa.projeto.model.Kitupgrade;
import com.empresa.projeto.service.KitupgradeService;

public class App {
    public static void main(String[] args) {

        KitupgradeService service = new KitupgradeService();
        Kitupgrade pc = service.criarPcRyzen();

        double valorComDesconto = pc.calcularDesconto(0.1);
        System.out.println("Valor com desconto: " + valorComDesconto);

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

