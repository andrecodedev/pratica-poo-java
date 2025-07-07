package Aula_1.TarefaFuncoes;

/*
Crie uma função que converta uma temperatura em graus Celsius para
Fahrenheit. A função deve receber a temperatura em Celsius como
parâmetro e retornar a temperatura equivalente em Fahrenheit.
? F = C * 9/5 + 32.
*/

public class Func_4 {
    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    public static void main(String[] args) {
        double celsius = 25.0;  // Exemplo de valor em Celsius

        double fahrenheit = celsiusParaFahrenheit(celsius);

        System.out.println(celsius + "°C é equivalente a " + fahrenheit + "°F.");
    }
}
