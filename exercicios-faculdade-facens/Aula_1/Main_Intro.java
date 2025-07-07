package Aula_1;

public class Main_Intro {
    public static void main(String[] args) {
        mostrarAlgo("testando envio...");
        int resultado = soma(5,3);
        
        System.out.println(resultado);
    } 
    
    public static void mostrarAlgo(String nome) {
        System.out.println(nome);
    }
    
    public static int soma(int num1, int num2) {
        int result = num1 + num2;
        
        return result;
    }
}


