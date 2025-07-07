package Aula12_Interface.Tarefa2.Devices;

import Aula12_Interface.Tarefa2.Devices.Device;
import Aula12_Interface.Tarefa2.IAdjustableVolume;

public class Computer extends Device implements IAdjustableVolume {

    public Computer(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void increaseVolume(int value) {
        System.out.println("Aumentando o volume do Computador em " + value);
    }

    @Override
    public void decreaseVolume(int value) {
        System.out.println("Diminuindo o volume do Computador em " + value);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Ligando o Computador: " + brand + " " + model);
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando o Computador: " + brand + " " + model);
    }
}
