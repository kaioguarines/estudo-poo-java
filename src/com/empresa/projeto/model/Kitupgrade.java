package com.empresa.projeto.model;

public class Kitupgrade {
    public String modelo;
    public String marca;
    public double preco;
    public int memoriaRam;
    public String processador;
    public String placamae;
    public Fabricante fabricante;

    public String getModelo() {
        return modelo;
    }

    //Metodos
    public double calcularDesconto(double desconto) {
        return preco * desconto;
    }

    public boolean adicionarMemoriaRam(int quantidade) {
        if (quantidade % 2 == 1) return false;
        memoriaRam += quantidade;
        preco += quantidade * 150;
        return true;
    }
}
