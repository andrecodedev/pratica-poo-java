package Aula_8_DB.view;

import Aula_8_DB.dao.ProdutoDAO;
import Aula_8_DB.entity.Produto;

import java.util.Scanner;
import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==== MENU PRODUTO ====");
            System.out.println("1 - Inserir Produto");
            System.out.println("2 - Apagar Produto");
            System.out.println("3 - Editar Produto");
            System.out.println("4 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = Integer.parseInt(scanner.nextLine());
            System.out.print("\n\n");
            switch (opcao) {
                case 1: // Inserir Produto
                    Produto novoProduto = new Produto();
                    System.out.print("Nome: ");
                    novoProduto.setNome(scanner.nextLine());

                    System.out.print("Quantidade: ");
                    novoProduto.setQuantidade(Integer.parseInt(scanner.nextLine()));

                    System.out.print("Valor Unitário: ");
                    novoProduto.setValorUnitario(Double.parseDouble(scanner.nextLine()));

                    produtoDAO.inserir(novoProduto);
                    System.out.println("Produto inserido com sucesso.");
                    break;

                case 2: // Apagar Produto
                    System.out.print("Informe o ID do produto a ser excluído: ");
                    int idExcluir = Integer.parseInt(scanner.nextLine());
                    produtoDAO.excluir(idExcluir);
                    System.out.println("Produto excluído com sucesso.");
                    break;

                case 3: // Editar Produto
                    System.out.print("Informe o ID do produto a ser editado: ");
                    int idEditar = Integer.parseInt(scanner.nextLine());
                    Produto produtoEditar = produtoDAO.getByField(Produto.class, "id", idEditar);

                    if (produtoEditar != null) {
                        System.out.print("Novo Nome (" + produtoEditar.getNome() + "): ");
                        produtoEditar.setNome(scanner.nextLine());

                        System.out.print("Nova Quantidade (" + produtoEditar.getQuantidade() + "): ");
                        produtoEditar.setQuantidade(Integer.parseInt(scanner.nextLine()));

                        System.out.print("Novo Valor Unitário (" + produtoEditar.getValorUnitario() + "): ");
                        produtoEditar.setValorUnitario(Double.parseDouble(scanner.nextLine()));

                        produtoDAO.editar(produtoEditar);
                        System.out.println("Produto atualizado com sucesso.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4: //Listar Produtos
                    ArrayList<Produto> produtos = produtoDAO.getAll(Produto.class);
                    for (Produto p : produtos) {
                        System.out.println("ID: " + p.getId()); // acessando via reflection
                        System.out.println("Nome: " + p.getNome());
                        System.out.println("Quantidade: " + p.getQuantidade());
                        System.out.println("Valor Unitário: " + p.getValorUnitario());
                        System.out.println("--------------------------");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
