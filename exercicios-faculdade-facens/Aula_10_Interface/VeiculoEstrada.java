package Aula_10_Interface;

public abstract class VeiculoEstrada extends Veiculo implements IGirar, IMover{
    private float VelocidadeGiro;

    @Override
    public void GirarDireita() {
        System.out.println("Girar Direita.....");
    }

    @Override
    public void GirarEsquerda() {
        System.out.println("Girar Esquerda.....");
    }

    @Override
    public void MoverFrente() {
        System.out.println("Movendo Frente.....");
    }

    @Override
    public void MoverTras() {
        System.out.println("Movendo Tras.....");
    }
}
