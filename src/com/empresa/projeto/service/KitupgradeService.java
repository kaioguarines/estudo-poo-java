package com.empresa.projeto.service;
import com.empresa.projeto.model.Fabricante;
import com.empresa.projeto.model.Kitupgrade;

    public class KitupgradeService {

        public Kitupgrade criarPcRyzen() {
            Fabricante ryzen = new Fabricante();
            ryzen.nome = "Pichau";
            ryzen.endereco = "Av.Paulista 23";

            Kitupgrade pc = new Kitupgrade();
            pc.modelo = "Ryzen";
            pc.marca = "Pichau";
            pc.memoriaRam = 8;
            pc.placamae = "b450m";
            pc.processador = "R7";
            pc.preco = 5600.00;
            pc.fabricante = ryzen;

            return pc;
        }
    }

