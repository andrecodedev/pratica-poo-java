package Aula12_Interface.Tarefa2;

import Aula12_Interface.Tarefa2.Midias.Audio;
import Aula12_Interface.Tarefa2.Devices.Computer;
import Aula12_Interface.Tarefa2.Devices.TV;
import Aula12_Interface.Tarefa2.Midias.Video;
import Aula12_Interface.Tarefa2.Devices.Smartphone;

public class MainMidia {
    public static void main(String[] args) {
        // Instanciando dispositivos e mídias
        TV tv = new TV("Samsung", "QLED");
        Computer computer = new Computer("Dell", "XPS");
        Smartphone smartphone = new Smartphone("Apple", "iPhone");

        Video video = new Video(120, "Filme de Ação");
        Audio audio = new Audio(5, "Podcast de Tecnologia");

        // Testando a TV
        tv.turnOn();
        tv.playMedia(video);
        tv.adjustBrightness(75);
        tv.increaseVolume(50);
        video.stop();
        tv.turnOff();
        System.out.println();

        // Testando o Computador
        computer.turnOn();
        computer.playMedia(audio);
        computer.increaseVolume(50);
        audio.stop();
        computer.turnOff();
        System.out.println();

        // Testando o Smartphone
        smartphone.turnOn();
        smartphone.playMedia(video);
        smartphone.adjustBrightness(60);
        smartphone.increaseVolume(70);
        video.stop();
        smartphone.turnOff();
    }
}
