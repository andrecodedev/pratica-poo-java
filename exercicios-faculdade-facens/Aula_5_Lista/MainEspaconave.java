package Aula_5_Lista;

public class MainEspaconave {
    public static void main(String[] args) {
        Espaconave nave = new Espaconave("Estrela da Morte");
        nave.addArma("Arma X", 100, "xxxxxxxxx");
        
        Arma arma1 = new Arma("Arma Y", 200, "YyYYYYYYyY");
        nave.addArma(arma1);
        
        nave.atiraTodas();
        
        nave.removeArma("Arma X");
        
        nave.atiraTodas();
        
    }
}
