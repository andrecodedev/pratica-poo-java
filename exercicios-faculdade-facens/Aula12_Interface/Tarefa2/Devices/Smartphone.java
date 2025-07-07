package Aula12_Interface.Tarefa2.Devices;

import Aula12_Interface.Tarefa2.IAdjustableVolume;
import Aula12_Interface.Tarefa2.IScreenAdjustable;

public class Smartphone extends Device implements IAdjustableVolume, IScreenAdjustable {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void increaseVolume(int value) {
        System.out.println("Aumentando o volume do Smartphone em " + value);
    }

    @Override
    public void decreaseVolume(int value) {
        System.out.println("Diminuindo o volume do Smartphone em " + value);
    }

    @Override
    public void adjustBrightness(int value) {
        System.out.println("Ajustando o brilho do Smartphone para " + value);
    }

    @Override
    public void adjustContrast(int value) {
        System.out.println("Ajustando o contraste do Smartphone para " + value);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Ligando o Smartphone: " + brand + " " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando o Smartphone: " + brand + " " + model);
    }
}
