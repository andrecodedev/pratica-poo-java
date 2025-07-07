package Aula_8_DB;

import Aula_8_DB.dao.ProdutoDAO;
import Aula_8_DB.entity.Produto;

import java.util.List;
import java.util.Scanner;

public class Main_Produto_Tarefa {
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    inserirProduto();
                    break;
                case 2: 
                    apagarProduto();
                    break;
                case 3:
                    editarProduto();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n--- MENU PRODUTO ---");
        System.out.println("1 - Inserir Produto");
        System.out.println("2 - Apagar Produto");
        System.out.println("3 - Editar Produto");
        System.out.println("4 - Listar Todos");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private static void inserirProduto() {
        Produto produto = new Produto();

        System.out.print("Nome: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Quantidade: ");
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

        System.out.print("Valor Unitário: ");
        produto.setValorUnitario(Double.parseDouble(scanner.nextLine()));

        produtoDAO.inserir(produto);
        System.out.println("Produto inserido com sucesso!");
    }

    private static void apagarProduto() {
        System.out.print("ID do produto a apagar: ");
        int id = Integer.parseInt(scanner.nextLine());

        produtoDAO.excluir(id);
        System.out.println("Produto excluído.");
    }

    private static void editarProduto() {
        System.out.print("ID do produto a editar: ");
        int id = Integer.parseInt(scanner.nextLine());

        Produto produto = produtoDAO.getByField(Produto.class, "id", id);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Novo nome (" + produto.getNome() + "): ");
        produto.setNome(scanner.nextLine());

        System.out.print("Nova quantidade (" + produto.getQuantidade() + "): ");
        produto.setQuantidade(Integer.parseInt(scanner.nextLine()));

        System.out.print("Novo valor unitário (" + produto.getValorUnitario() + "): ");
        produto.setValorUnitario(Double.parseDouble(scanner.nextLine()));

        produtoDAO.editar(produto);
        System.out.println("Produto editado.");
    }

    private static void listarProdutos() {
        List<Produto> produtos = produtoDAO.getAll(Produto.class);
        
        if (produtos.isEmpty()) {
            System.out.println("\n#### LISTA VAZIA ###");
        }
        else {
            System.out.println("\n--- LISTA DE PRODUTOS ---");
        
            for (Produto p : produtos) {
                System.out.println("ID: " + p.getId() +
                                   " | Nome: " + p.getNome() +
                                   " | Qtde: " + p.getQuantidade() +
                                   " | Valor: R$" + p.getValorUnitario());
            }
        }  
    }
}
