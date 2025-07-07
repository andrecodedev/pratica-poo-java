package Aula12_Interface.Tarefa2.Midias;

public class Video extends Media {

    public Video(int duration, String title) {
        super(duration, title);
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo vídeo: " + title);
    }

    @Override
    public void stop() {
        System.out.println("Parando vídeo: " + title);
    }
}
