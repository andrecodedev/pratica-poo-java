package Aula_9_Abstract_Static;

public class Demo {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta.mostrarQtde();
        
        
        Conta c2 = new Conta();
         Conta.mostrarQtde();
        
        c1.setQtde(22);
         Conta.mostrarQtde();
         Conta.mostrarQtde();

    }
}
