package Aula_3.Tarefa;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnimalVirtual animal = null;
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Animal");
            System.out.println("2. Alimentar");
            System.out.println("3. Brincar");
            System.out.println("4. Dormir");
            System.out.println("5. Mostrar Status");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            System.out.println("-------------------------------");
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do animal: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o tipo do animal (ex: gato, cachorro): ");
                    String tipo = scanner.nextLine();
                    System.out.print("Digite a idade do animal: ");
                    int idade = scanner.nextInt();
                    animal = new AnimalVirtual();
                    animal.setNome(nome);
                    animal.setIdade(idade);
                    animal.setTipo(tipo);
                    
                    System.out.println("Animal cadastrado com sucesso!");
                    break;
                case 2:
                    if (animal != null) {
                        animal.alimentar();
                        System.out.println("Você alimentou o animal.");
                    } else {
                        System.out.println("Cadastre um animal primeiro.");
                    }
                    break;
                case 3:
                    if (animal != null) {
                        animal.brincar();
                        System.out.println("Você brincou com o animal.");
                    } else {
                        System.out.println("Cadastre um animal primeiro.");
                    }
                    break;
                case 4:
                    if (animal != null) {
                        animal.dormir();
                        System.out.println("O animal dormiu e recuperou a energia.");
                    } else {
                        System.out.println("Cadastre um animal primeiro.");
                    }
                    break;
                case 5:
                    if (animal != null) {
                        animal.mostrarStatus();
                    } else {
                        System.out.println("Cadastre um animal primeiro.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}