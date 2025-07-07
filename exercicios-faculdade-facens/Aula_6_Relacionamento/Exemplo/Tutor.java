package Aula_6_Relacionamento.Exemplo;
import java.util.ArrayList;

class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> pets;

    public Tutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pets = new ArrayList<>();
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public String imprimir() {
        String resultado = "Tutor: " + nome + ", CPF: " + cpf + "\n";
        
        resultado += "Pets:\n";
        
        for (Pet pet : pets) {
            resultado += "  - " + pet.imprimir() + "\n";
        }
        return resultado;
    }
}
