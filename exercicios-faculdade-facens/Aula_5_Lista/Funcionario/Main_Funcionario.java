package Aula_5_Lista.Funcionario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main_Funcionario {

    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        int opcao;

        do {
            String menu = "Menu:\n"
                    + "1 ? Cadastrar funcionário\n"
                    + "2 ? Mostrar todos os funcionários\n"
                    + "3 ? Mostrar funcionário por código\n"
                    + "0 ? Sair";

            String input = JOptionPane.showInputDialog(menu);
            if (input == null) {
                break; // Se o usuário cancelar, encerra o programa
            }
            opcao = Integer.parseInt(input);

            switch (opcao) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código:"));
                    String nome = JOptionPane.showInputDialog("Nome:");
                    String setor = JOptionPane.showInputDialog("Setor:");
                    String funcao = JOptionPane.showInputDialog("Função:");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));

                    Funcionario funcionario = new Funcionario(codigo, nome, setor, funcao, salario);
                    listaFuncionarios.add(funcionario);

                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaFuncionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder("Lista de Funcionários:\n");
                        for (Funcionario f : listaFuncionarios) {
                            lista.append(f.imprimir()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 3:
                    int codigoBusca = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário:"));
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCodigo() == codigoBusca) {
                            JOptionPane.showMessageDialog(null, "Funcionário encontrado:\n" + f.imprimir());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
                    }
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
            }
        } while (opcao != 0);
    }
}
