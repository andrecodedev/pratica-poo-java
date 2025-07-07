package Aula_10_Interface;

import java.util.ArrayList;

public class Main_Veiculo {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro porshe = new Carro();
        Trem trem1 = new Trem();
        
        ArrayList<IMover> v = new ArrayList<>();
        v.add(fusca);
        v.add(porshe);
        v.add(trem1);
        
        for (IMover obj : v) {
            obj.MoverFrente();
        }
        
    }
}
