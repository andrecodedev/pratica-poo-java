package Aula12_Interface.Tarefa2.Midias;

import Aula12_Interface.Tarefa2.IMedia;

public abstract class Media implements IMedia {
    protected int duration;
    protected String title;

    public Media(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }
}

