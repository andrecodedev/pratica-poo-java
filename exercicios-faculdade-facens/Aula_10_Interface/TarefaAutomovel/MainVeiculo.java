package Aula_10_Interface.TarefaAutomovel;

import java.util.ArrayList;
import java.util.List;

public class MainVeiculo {
    public static void main(String[] args) {
        // Lista de IAutomatico
        List<IAutomatico> automaticos = new ArrayList<>();
        
        // Adicionando elementos que implementam IAutomatico
        automaticos.add(new CarroAutomatico("Toyota", "Corolla", 2021));
        automaticos.add(new MotoAutomatica("Honda", "NC750X", 2022));
        automaticos.add(new Aviao("Boeing 747"));
        
        // Usando polimorfismo para chamar mudaMarchaAutomaticamente em cada elemento
        System.out.println("Teste de IAutomatico:");
        for (IAutomatico automatico : automaticos) {
            automatico.mudaMarchaAutomaticamente();
        }

        System.out.println();

        // Lista de IVoa
        List<IVoa> voadores = new ArrayList<>();
        
        // Adicionando elementos que implementam IVoa
        voadores.add(new Aviao("Airbus A380"));
        voadores.add(new Morcego("Morcego Frugívoro"));
        
        // Usando polimorfismo para chamar voar em cada elemento
        System.out.println("Teste de IVoa:");
        for (IVoa voador : voadores) {
            voador.voar();
        }
    }
}

