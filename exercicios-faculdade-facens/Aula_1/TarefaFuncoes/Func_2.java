package Aula_1.TarefaFuncoes;
/*
Crie uma função que receba um número inteiro como parâmetro e
retorne verdadeiro se o número for par, ou falso caso contrário.
*/

public class Func_2 {
   public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int numero = 10;

        if (ehPar(numero)) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
