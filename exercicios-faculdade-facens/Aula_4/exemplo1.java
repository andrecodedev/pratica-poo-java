package Aula_4;

import javax.swing.JOptionPane;

public class exemplo1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
        char sexo = JOptionPane.showInputDialog("Sexo").charAt(0);
        
        System.out.println("Valor: "+valor);
    }
}
