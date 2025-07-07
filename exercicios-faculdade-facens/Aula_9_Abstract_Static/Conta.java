package Aula_9_Abstract_Static;

public class Conta {
    private static int qtde = 0;

    public Conta() {
        qtde++;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    public static void mostrarQtde() {
        System.out.println(qtde);
    } 
}
