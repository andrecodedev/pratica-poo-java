package Aula_6_Relacionamento.Exemplo;


// Classe principal com main
public class Main_Pet {
    public static void main(String[] args) {
        Tutor tutor = new Tutor("Fábio", "123.456.789-00");
        Pet pet1 = new Pet("Rex", "Labrador", 5);
        Pet pet2 = new Pet("Mimi", "Persa", 3);

        tutor.adicionarPet(pet1);
        tutor.adicionarPet(pet2);

        System.out.println(tutor.imprimir());
    }
}
