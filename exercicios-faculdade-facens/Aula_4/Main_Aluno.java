package Aula_4;

import javax.swing.JOptionPane;

public class Main_Aluno {
    public static void main(String[] args) {
        Aluno alu = new Aluno("Fabio", 9, 7);
        
        JOptionPane.showMessageDialog(null, alu.calculaNota());
        JOptionPane.showMessageDialog(null, alu.calculaNota(10));
        JOptionPane.showMessageDialog(null, alu.calculaNota(10,8));
    }
}
