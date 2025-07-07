
package Aula_3.Tarefa;


public class AnimalVirtual
{
    private String nome;
    private String tipo;
    private int idade;
    private int felicidade = 100;
    private int energia = 100;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    
    public void alimentar()
    {
        energia += 10;
    }

    public void brincar()
    {
        felicidade += 10;
        energia -= 5;
    }
    
    public void dormir()
    {
        energia = 100;
    }
    
    public void mostrarStatus()
    {
        System.out.println("\n==========================="+
                        "\nNome: "+nome+
                        "\nTipo: "+tipo+
                        "\nIdade: "+idade+
                        "\n---------------------"+
                        "\nEnergia: "+energia+
                        "\nFelicidade: "+felicidade);
    }
}