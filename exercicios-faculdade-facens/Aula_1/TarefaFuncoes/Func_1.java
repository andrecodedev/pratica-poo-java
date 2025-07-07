/*
Crie uma fun��o que simule uma calculadora simples. Ela deve
receber dois n�meros e um operador (+, -, *, /) como par�metros e
retornar o resultado da opera��o.
*/

public class Func_1 {
    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Erro: divis�o por zero.");
                    return Double.NaN;  // Retorna "NaN" para indicar erro.
                }
            default:
                System.out.println("Operador inv�lido. Use +, -, * ou /.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        char operador = '+';

        double resultado = calcular(num1, num2, operador);
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
