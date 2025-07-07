package Aula_10_Interface;

public abstract class VeiculoTrilho extends Veiculo implements IMover{

    @Override
    public void MoverFrente() {
        System.out.println("Movendo Frente.....");
    }

    @Override
    public void MoverTras() {
        System.out.println("Movendo Tras.....");
    }
   
}
