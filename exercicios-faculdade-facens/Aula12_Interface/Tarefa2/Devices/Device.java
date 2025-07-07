package Aula12_Interface.Tarefa2.Devices;

import Aula12_Interface.Tarefa2.IMedia;

public abstract class Device {
    protected String brand;
    protected String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println("Ligando o dispositivo: " + brand + " " + model);
    }

    public void turnOff() {
        System.out.println("Desligando o dispositivo: " + brand + " " + model);
    }

    public void playMedia(IMedia media) {
        System.out.println("Reproduzindo mídia no dispositivo: " + brand + " " + model);
        media.play();
    }
}
