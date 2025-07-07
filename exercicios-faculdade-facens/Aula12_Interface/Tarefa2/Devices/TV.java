package Aula12_Interface.Tarefa2.Devices;

import Aula12_Interface.Tarefa2.IAdjustableVolume;
import Aula12_Interface.Tarefa2.IScreenAdjustable;

public class TV extends Device implements IAdjustableVolume, IScreenAdjustable {

    public TV(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void increaseVolume(int value) {
        System.out.println("Aumentando o volume da TV em " + value);
    }

    @Override
    public void decreaseVolume(int value) {
        System.out.println("Diminuindo o volume da TV em " + value);
    }

    @Override
    public void adjustBrightness(int value) {
        System.out.println("Ajustando o brilho da TV para " + value);
    }

    @Override
    public void adjustContrast(int value) {
        System.out.println("Ajustando o contraste da TV para " + value);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Ligando o TV: " + brand + " " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando o TV: " + brand + " " + model);
    }
}

